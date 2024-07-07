package com.sashwat.springboot.service;

import com.sashwat.springboot.entity.Auctioneer;
import com.sashwat.springboot.entity.UserInfo;

public interface AuctioneerService {
    Auctioneer saveAuctioneer(Auctioneer auction);

    String addUser(UserInfo userInfo);
}
