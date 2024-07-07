package com.sashwat.springboot.controller;

import com.sashwat.springboot.entity.Auctioneer;
import com.sashwat.springboot.entity.UserInfo;
import com.sashwat.springboot.service.AuctioneerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuctioneerController {

    @Autowired
    private AuctioneerService auctioneerService;

    @PostMapping("/auctioneer")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Auctioneer addNewAuctioneer(@RequestBody Auctioneer auction){
        return auctioneerService.saveAuctioneer(auction);
    }

    @PostMapping("/new-user")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return auctioneerService.addUser(userInfo);
    }
}
