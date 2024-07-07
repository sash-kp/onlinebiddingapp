package com.sashwat.springboot.repository;

import com.sashwat.springboot.entity.Auctioneer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctioneerRepository extends JpaRepository<Auctioneer,String> {

}

