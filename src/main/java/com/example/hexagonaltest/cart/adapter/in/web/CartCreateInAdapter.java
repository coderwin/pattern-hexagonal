package com.example.hexagonaltest.cart.adapter.in.web;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartCreateRequestDTO;
import com.example.hexagonaltest.cart.application.usecase.CartCreateUseCase;
import com.example.hexagonaltest.cart.common.CartWebInAdapter;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 설명 : 장바구니 데이터 생성 in adapter
 */
@RequiredArgsConstructor
@RequestMapping("/carts")
@RestController
@CartWebInAdapter// 카트의 인바운드 어댑터 표시
public class CartCreateInAdapter {

    private final CartCreateUseCase cartCreateUseCase;// service 이다. application에 위치

    /**
     * 기능 : 상품 담기(생성)
     * @param request
     */
    @Operation(summary = "장바구니 상품 정보 등록", description = "장바구니 상품번호, 주문자번호 입력 => 등록")
    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CartCreateRequestDTO request) {

        // in port로 이동해서 application으로 이동한다.
        cartCreateUseCase.create(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }






}
