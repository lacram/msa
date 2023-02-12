package com.example.orderservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payload {
    private Long user_id;
    private String product_id;
    private int qty;
    private int unit_price;
    private int total_price;
}
