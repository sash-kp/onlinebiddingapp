package com.sashwat.springboot.service;

import com.sashwat.springboot.dtos.AuctionDetailsDTO;
import com.sashwat.springboot.dtos.BidderDetailsDTO;
import com.sashwat.springboot.entity.Auction;
import com.sashwat.springboot.entity.Auctioneer;
import com.sashwat.springboot.entity.BidInformation;
import com.sashwat.springboot.entity.Bidder;
import com.sashwat.springboot.repository.AuctioneerRepository;
import com.sashwat.springboot.repository.BidInformationRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidInformationServiceImpl implements BidInformationService{

    @Autowired
    private BidInformationRepository bidInformationRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public BidInformation saveBidInformation(BidInformation bidInformation) {
        return bidInformationRepository.save(bidInformation);
    }

    private BidderDetailsDTO convertEntityToDto(Bidder bidder){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        BidderDetailsDTO bidderDetailsDTO = new BidderDetailsDTO();
        bidderDetailsDTO = modelMapper.map(bidder, BidderDetailsDTO.class);
        return bidderDetailsDTO;
    }

    private Bidder convertDtoToEntity(BidderDetailsDTO bidderDetailsDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Bidder bidder = new Bidder();
        bidder = modelMapper.map(bidderDetailsDTO, Bidder.class);
        return bidder;
    }
}
