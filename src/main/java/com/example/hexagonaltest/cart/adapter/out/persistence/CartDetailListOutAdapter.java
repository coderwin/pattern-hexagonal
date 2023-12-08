package com.example.hexagonaltest.cart.adapter.out.persistence;

import com.example.hexagonaltest.cart.application.port.out.CartDetailListOutPort;
import com.example.hexagonaltest.cart.common.CartWebOutAdapter;
import com.example.hexagonaltest.cart.domain.CartDomainDetailListResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * 설명 : Cart Detail List out adapter
 *       -> DB에 데이터를 요청한다.
 */
@RequiredArgsConstructor
@Service
@CartWebOutAdapter(value = {"asdf", "asdf"})
public class CartDetailListOutAdapter implements CartDetailListOutPort {

    private final CartRepository cartRepository;// DB 데이터 조회 요청
    private final CartMapper cartMapper;// cart entity를 domain vo로 변환


    @Override
    public List<CartDomainDetailListResponseDTO> findAll() {

        // db 데이터 조회
        List<Cart> cartList = cartRepository.findAll();

        // cart entity -> domain vo로 변환한다.
        List<CartDomainDetailListResponseDTO> cartDomainDetailListResponseDtoList =
                cartList.stream()
                        .map(cartMapper::cartToCartDomainDetailListResponseDto)
                        .collect(toList());

        return cartDomainDetailListResponseDtoList;
    }
}
