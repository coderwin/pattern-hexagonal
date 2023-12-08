package com.example.hexagonaltest.cart.adapter.out.persistence;

import com.example.hexagonaltest.cart.application.port.out.CartCreateOutPort;
import com.example.hexagonaltest.cart.common.CartWebOutAdapter;
import com.example.hexagonaltest.cart.domain.CartDomainCreateRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 설명 : 카트 데이터 저장을 요청한다.
 */
@RequiredArgsConstructor
@Component
@CartWebOutAdapter
public class CartCreateOutAdapter implements CartCreateOutPort {

    private final CartRepository cartRepository;// DB에 저장하기
    private final CartMapper cartMapper;// db에서 받아온 데이터를 dto로 변경 또는
                                        // dto를 db로 보낼 데이터로 변경한다.

    public void create(CartDomainCreateRequestDTO request) {

        // entity를 생성한다.
        Cart cart = cartMapper.cartDomainCreateRequestDtoToCart(request);

        // db로 보낸다.
        cartRepository.save(cart);
    }




}
