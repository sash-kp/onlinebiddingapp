package com.sashwat.springboot.controller;

import com.sashwat.springboot.entity.BidInformation;
import com.sashwat.springboot.entity.Bidder;
import com.sashwat.springboot.service.BidInformationService;
import com.sashwat.springboot.service.BidderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BidInformationController {

    @Autowired
    private BidInformationService bidInformationService;

    @PostMapping("/bid")
    public BidInformation addNewBidInformation(@RequestBody BidInformation bidInformation){
        return bidInformationService.saveBidInformation(bidInformation);
    }

}
