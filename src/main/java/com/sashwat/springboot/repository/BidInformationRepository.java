package com.sashwat.springboot.repository;

import com.sashwat.springboot.entity.BidInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidInformationRepository extends JpaRepository<BidInformation,String> {
}
