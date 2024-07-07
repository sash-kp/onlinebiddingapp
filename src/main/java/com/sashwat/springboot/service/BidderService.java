package com.sashwat.springboot.service;

import com.sashwat.springboot.entity.Auctioneer;
import com.sashwat.springboot.entity.Bidder;

public interface BidderService {
    Bidder saveBidder(Bidder bidder);
}
