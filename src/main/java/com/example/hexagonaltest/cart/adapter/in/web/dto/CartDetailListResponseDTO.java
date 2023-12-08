package com.example.hexagonaltest.cart.adapter.in.web.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 설명 : 장바구니에 있는 상품 데이터를 전달한다.
 */
@Getter
@Setter
public class CartDetailListResponseDTO {

    private Long id;
    private Long productId;
    private Long customerId;


}
