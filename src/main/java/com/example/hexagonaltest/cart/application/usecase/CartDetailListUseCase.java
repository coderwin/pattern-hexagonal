package com.example.hexagonaltest.cart.application.usecase;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartDetailListResponseDTO;

import java.util.List;

/**
 * 설명 : 장바구니 상품 전체 목록을 조회하는 usecsae, service
 */
public interface CartDetailListUseCase {

    /**
     * 기능: cart에 담긴 모든 상품을 조회할 수 있습니다.
     *      -> domain vo를 response dto로 변경합니다.
     */
    List<CartDetailListResponseDTO> findAll();
}
