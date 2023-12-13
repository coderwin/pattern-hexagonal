package com.example.hexagonaltest.cart.adapter.in.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CartCreateRequestDTO {

    @Setter
    private Long productId;
    @Setter
    private Long customerId;


}
