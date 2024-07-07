package com.sashwat.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Auctioneer implements Serializable {
    @Serial
    private static final long serialVersionUID = -7701474719551240349L;

    @Id
    @UuidGenerator
    private String auctioneer_id;
    private String email;
    private String fullName;

    @OneToMany(
            mappedBy = "auctioneer"
    )
    private List<Auction> auctions;


}
