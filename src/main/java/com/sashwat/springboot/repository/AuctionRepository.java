package com.sashwat.springboot.repository;

import com.sashwat.springboot.entity.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends JpaRepository<Auction,String> {

}
