package com.example.hexagonaltest.cart.application.port.in;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartDetailResponseDTO;
import com.example.hexagonaltest.cart.application.port.out.CartDetailOutPort;
import com.example.hexagonaltest.cart.application.usecase.CartDetailUseCase;
import com.example.hexagonaltest.cart.common.CartWebInPort;
import com.example.hexagonaltest.cart.domain.CartDomainDetailResponseDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 설명 : cart 상세조회 in port
 *      -> domain 데이터로 변경합니다.
 *      -> out Port를 요청합니다.
 */
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
@CartWebInPort
public class CartDetailInPort implements CartDetailUseCase {

    private final CartDetailOutPort cartDetailOutPort;

    @Override
    public CartDetailResponseDTO select(Long id) {

        // domain vo를 불러온다.
        CartDomainDetailResponseDTO cartDomainDetailResponseDto = cartDetailOutPort.findById(id);
        // domain vo를 CartDetailResponseDTO로 변경한다.
        ModelMapper mapper = new ModelMapper();
        CartDetailResponseDTO cartDetailResponseDto = mapper.map(cartDomainDetailResponseDto, CartDetailResponseDTO.class);

        return cartDetailResponseDto;
    }
}
