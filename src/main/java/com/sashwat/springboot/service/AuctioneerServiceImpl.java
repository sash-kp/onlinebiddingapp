package com.sashwat.springboot.service;

import com.sashwat.springboot.entity.Auctioneer;
import com.sashwat.springboot.entity.UserInfo;
import com.sashwat.springboot.repository.AuctioneerRepository;
import com.sashwat.springboot.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuctioneerServiceImpl implements AuctioneerService{

    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuctioneerRepository auctioneerRepository;

    @Override
    public Auctioneer saveAuctioneer(Auctioneer auctioneer) {
        return auctioneerRepository.save(auctioneer);
    }

    @Override
    public String addUser(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "user added to system";
    }
}
