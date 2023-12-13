package com.example.hexagonaltest.cart.application.usecase;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartDetailResponseDTO;

/**
 * 기능 : 장바구니 상세보기 service
 *       -> cart in port에서 구현합니다.
 */
public interface CartDetailUseCase {

    /**
     * 기능 : id로 조회할 수 있습니다.
     * @param id
     * @return
     */
    CartDetailResponseDTO select(Long id);
}
