package com.sashwat.springboot.service;

import com.sashwat.springboot.dtos.AuctionDetailsDTO;
import com.sashwat.springboot.dtos.AuctionResponseDTO;
import com.sashwat.springboot.entity.Auction;
import com.sashwat.springboot.repository.AuctionRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AuctionServiceImpl implements AuctionService{

    @Autowired
    private AuctionRepository auctionRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Auction saveAuction(Auction auction) {
        return auctionRepository.save(auction);
    }

    @Override
    public AuctionResponseDTO fetchAuctions() {
        AuctionResponseDTO auctionResponseDTO = new AuctionResponseDTO();
        auctionResponseDTO.setNumberOfAuctions(auctionRepository.findAll().size());
        auctionResponseDTO.setStatusMap(
                auctionRepository.findAll().stream()
                        .collect(Collectors.toMap(Auction::getAuction_id,Auction::getStatus)));
        return auctionResponseDTO;
    }

    private AuctionDetailsDTO convertEntityToDto(Auction auction){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        AuctionDetailsDTO auctionDetailsDTO = new AuctionDetailsDTO();
        auctionDetailsDTO = modelMapper.map(auction, AuctionDetailsDTO.class);
        return auctionDetailsDTO;
    }

    private Auction convertDtoToEntity(AuctionDetailsDTO auctionDetailsDTO){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Auction auction = new Auction();
        auction = modelMapper.map(auctionDetailsDTO, Auction.class);
        return auction;
    }
}
