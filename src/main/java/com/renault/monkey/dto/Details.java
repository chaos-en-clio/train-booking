package com.renault.monkey.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public  class Details{
    private String departure;
    private String destination;
    private Integer price;
}