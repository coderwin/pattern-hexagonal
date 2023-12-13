package com.example.hexagonaltest.cart.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDomainCreateRequestDTO {

    private Long productId;
//    @JsonProperty(value = "memberId")
    private Long customerId;

}
