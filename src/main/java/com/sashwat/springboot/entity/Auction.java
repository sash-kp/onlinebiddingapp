package com.sashwat.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Auction implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @UuidGenerator
    private String auction_id;

    private Date startTime;

    private Date endTime;

    private Double reservedAmount;

    private String status;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "auctioneer_id",
            referencedColumnName = "auctioneer_id"
    )
    private Auctioneer auctioneer;

    //private List<BidInformation> biddings;

    @OneToMany(
            mappedBy = "auction"
    )
    private List<Bidder> participants;

    private Item item;

}
