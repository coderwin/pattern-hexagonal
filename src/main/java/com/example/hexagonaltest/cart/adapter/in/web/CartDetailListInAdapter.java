package com.example.hexagonaltest.cart.adapter.in.web;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartDetailListResponseDTO;
import com.example.hexagonaltest.cart.application.usecase.CartDetailListUseCase;
import com.example.hexagonaltest.cart.common.CartWebInAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 설명 : cart 상품 모두 조회 in adapter
 */
@RequestMapping("/carts")
@RequiredArgsConstructor
@RestController
@CartWebInAdapter
public class CartDetailListInAdapter {

    private final CartDetailListUseCase cartDetailListUseCase;// cart usecase or service 실행

    /**
     * 설명 : 장바구니에 담기 모든 상품을 조회할 수 있습니다.
     */
    @GetMapping
    public ResponseEntity<List<CartDetailListResponseDTO>> selectAll() {
        // usecase로 조회한다.
        List<CartDetailListResponseDTO> body = cartDetailListUseCase.findAll();
        // 데이터를 반환한다.
        return ResponseEntity.ok()
                .body(body);

    }


}
