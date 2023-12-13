package com.example.hexagonaltest.cart.adapter.out.persistence;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartDetailResponseDTO;
import com.example.hexagonaltest.cart.domain.CartDomainCreateRequestDTO;
import com.example.hexagonaltest.cart.domain.CartDomainDetailListResponseDTO;
import com.example.hexagonaltest.cart.domain.CartDomainDetailResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * 기능 : domain dto를 entity로 바꾸거나
 *       enityt를 domain dto로 바꾼다.
 */
@Component
public class CartMapper {

    /**
     * 설명 : CartDomainCreateRequestDTO -> Cart 로 변경한다.
     * @param request
     * @return
     */
    public Cart cartDomainCreateRequestDtoToCart(CartDomainCreateRequestDTO request) {

        ModelMapper mapper = new ModelMapper();
        Cart cart = mapper.map(request, Cart.class);
        return cart;
    }

    /**
     * 설명 : Cart -> CartDomainDetialResponseDTO(VO)로 변경한다.
     * @param cart
     * @return
     */
    public CartDomainDetailResponseDTO cartToCartDomainDetailResponseDTO(Cart cart) {

        ModelMapper mapper = new ModelMapper();
        CartDomainDetailResponseDTO cartDomainDetailResponseDto = mapper.map(cart, CartDomainDetailResponseDTO.class);
        return cartDomainDetailResponseDto;
    }

    /**
     * 기능 : Cart -> CartDomainDetailListResponseDTO(VO)로 변경한다.
     * @param cart
     * @return
     */
    public CartDomainDetailListResponseDTO cartToCartDomainDetailListResponseDto(Cart cart) {

        ModelMapper mapper = new ModelMapper();
        return mapper.map(cart, CartDomainDetailListResponseDTO.class);
    }
}
