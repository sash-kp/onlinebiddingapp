package com.sashwat.springboot.repository;

import com.sashwat.springboot.entity.Bidder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidderRepository extends JpaRepository<Bidder,String> {
}
