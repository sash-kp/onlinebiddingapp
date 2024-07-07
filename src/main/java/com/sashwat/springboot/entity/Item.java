package com.sashwat.springboot.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Item implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String itemName;

    private String itemDescription;
}
