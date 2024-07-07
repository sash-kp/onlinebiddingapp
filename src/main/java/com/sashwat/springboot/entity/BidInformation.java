package com.sashwat.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Builder
@ToString
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BidInformation implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @UuidGenerator
    private String bidding_id;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "bidder_id",
            referencedColumnName = "bidder_id"
    )
    private Bidder bidder;

    private Double amount;


}
