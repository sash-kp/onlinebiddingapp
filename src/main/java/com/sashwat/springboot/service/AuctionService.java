package com.sashwat.springboot.service;

import com.sashwat.springboot.dtos.AuctionResponseDTO;
import com.sashwat.springboot.entity.Auction;
import com.sashwat.springboot.entity.Auctioneer;
import com.sashwat.springboot.repository.AuctionRepository;

public interface AuctionService {
    Auction saveAuction(Auction auction);

    AuctionResponseDTO fetchAuctions();
}
