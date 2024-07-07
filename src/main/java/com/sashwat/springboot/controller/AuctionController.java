package com.sashwat.springboot.controller;

import com.sashwat.springboot.dtos.AuctionResponseDTO;
import com.sashwat.springboot.entity.Auction;
import com.sashwat.springboot.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    @PostMapping("/auction")
    public Auction addNewAuction(@RequestBody Auction auction){
        return auctionService.saveAuction(auction);
    }

    @GetMapping("/fetch-auctions")
    public ResponseEntity<AuctionResponseDTO> fetchAuctions() {
        AuctionResponseDTO auctionResponseDTO = auctionService.fetchAuctions();
        return ResponseEntity.status(HttpStatus.OK).body(auctionResponseDTO);
    }

}
