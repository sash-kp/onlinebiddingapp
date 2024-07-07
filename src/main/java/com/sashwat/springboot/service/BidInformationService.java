package com.sashwat.springboot.service;

import com.sashwat.springboot.entity.Auctioneer;
import com.sashwat.springboot.entity.BidInformation;

public interface BidInformationService {
    BidInformation saveBidInformation(BidInformation bidInformation);
}
