package com.example.hexagonaltest.cart.adapter.out.persistence;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartDetailResponseDTO;
import com.example.hexagonaltest.cart.application.port.out.CartDetailOutPort;
import com.example.hexagonaltest.cart.common.CartWebOutAdapter;
import com.example.hexagonaltest.cart.domain.CartDomainDetailResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 기능 : db 데이터를 조회합니다.
 *       ->
 */
@RequiredArgsConstructor
@Service
@CartWebOutAdapter
public class CartDetailOutAdapter implements CartDetailOutPort {

    private final CartRepository cartRepository;// DB데이터를 조회합니다.
    private final CartMapper cartMapper;// Cart Entity를 ResponseDTO로 변환합니다.

    /**
     * 기능 : id로 조회할 수 있습니다.
     * @param id
     * @return
     */

    @Override
    public CartDomainDetailResponseDTO findById(Long id) {

        // Cart 조회
        Cart cart = cartRepository.findById(id).orElseThrow(() -> {
            String errMsg = "요청 상품?이 없습니다.";
            return new IllegalArgumentException(errMsg);
        });
        // domain의 ResponseDTO로 반환합니다.
        CartDomainDetailResponseDTO cartDomainDetailResponseDto = cartMapper.cartToCartDomainDetailResponseDTO(cart);

        return cartDomainDetailResponseDto;
    }
}
