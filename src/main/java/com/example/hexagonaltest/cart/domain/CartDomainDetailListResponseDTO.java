package com.example.hexagonaltest.cart.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
public class CartDomainDetailListResponseDTO {

    private Long id;
    private Long productId;
    private Long customerId;

    public CartDomainDetailListResponseDTO(Long id, Long productId, Long customerId) {
        this.id = id;
        this.productId = productId;
        this.customerId = customerId;
    }
}
