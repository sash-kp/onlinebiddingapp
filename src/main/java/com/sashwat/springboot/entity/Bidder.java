package com.sashwat.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Builder
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Bidder implements Serializable {
    @Serial
    private static final long serialVersionUID = -7701472919551240347L;

    @Id
    @UuidGenerator
    private String bidder_id;
    private String email;
    private String fullName;

    @OneToMany(
            mappedBy = "bidder"
    )
    private List<BidInformation> biddings;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "auction_id",
            referencedColumnName = "auction_id"
    )
    private Auction auction;

}
