package com.sashwat.springboot.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BidderDetailsDTO implements Serializable {
    private String bidder_id;
    private String email;
    private String fullName;
}
