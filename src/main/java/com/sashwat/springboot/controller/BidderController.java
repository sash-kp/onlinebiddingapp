package com.sashwat.springboot.controller;

import com.sashwat.springboot.entity.Auction;
import com.sashwat.springboot.entity.Bidder;
import com.sashwat.springboot.service.AuctionService;
import com.sashwat.springboot.service.BidderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BidderController {

    @Autowired
    private BidderService bidderService;

    @PostMapping("/bidder")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Bidder addNewBidder(@RequestBody Bidder bidder){
        return bidderService.saveBidder(bidder);
    }

}
