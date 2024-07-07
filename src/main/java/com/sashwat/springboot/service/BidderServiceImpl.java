package com.sashwat.springboot.service;

import com.sashwat.springboot.entity.Bidder;
import com.sashwat.springboot.repository.BidderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidderServiceImpl implements BidderService {

    @Autowired
    private BidderRepository bidderRepository;

    @Override
    public Bidder saveBidder(Bidder bidder) {
        return bidderRepository.save(bidder);
    }
}
