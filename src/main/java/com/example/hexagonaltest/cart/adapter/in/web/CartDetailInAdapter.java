package com.example.hexagonaltest.cart.adapter.in.web;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartDetailResponseDTO;
import com.example.hexagonaltest.cart.application.usecase.CartDetailUseCase;
import com.example.hexagonaltest.cart.common.CartWebOutAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 설명 : 장바구니 조회 in adapter
 */
@RequiredArgsConstructor
@RequestMapping("/carts")
@RestController
@CartWebOutAdapter
public class CartDetailInAdapter {

    private final CartDetailUseCase cartDetailUseCase;// application에 데이터 요청하기 -> in port에 데이터 요청하기?

    /**
     * 기능 : 장바구니 상세 데이터를 불러옵니다.
     */
    @GetMapping("/{id}")
    public ResponseEntity<CartDetailResponseDTO> select(@PathVariable Long id) {

        // in port 에서 데이터를 조회합니다.
        // service or useCase를 요청합니다.
        CartDetailResponseDTO body = cartDetailUseCase.select(id);
        // 요청에 응답합니다.
        return ResponseEntity.status(HttpStatus.OK)
                .body(body);
    }




}
