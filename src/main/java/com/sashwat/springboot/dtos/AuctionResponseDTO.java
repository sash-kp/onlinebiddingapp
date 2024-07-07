package com.sashwat.springboot.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuctionResponseDTO {
    private Integer numberOfAuctions;
    private Map<String,String> statusMap;
}
