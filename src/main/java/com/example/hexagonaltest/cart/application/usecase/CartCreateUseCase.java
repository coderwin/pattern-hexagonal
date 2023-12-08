package com.example.hexagonaltest.cart.application.usecase;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartCreateRequestDTO;

/**
 * 설명 : Cart create 서비스 로직 처리 interface
 */
public interface CartCreateUseCase {

    /**
     * 기능 : 상품 담기(생성)
     * @param request
     */
    void create(CartCreateRequestDTO request);
}
