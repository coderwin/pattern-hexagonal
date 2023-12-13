package com.example.hexagonaltest.cart.application.port.in;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartDetailListResponseDTO;
import com.example.hexagonaltest.cart.application.port.out.CartDetailListOutPort;
import com.example.hexagonaltest.cart.application.usecase.CartDetailListUseCase;
import com.example.hexagonaltest.cart.common.CartWebInPort;
import com.example.hexagonaltest.cart.domain.CartDomainDetailListResponseDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * 설명 : cart 상품 모두 조회 in port
 *       -> domain vo를 response dto로 변경한다.
 */
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
@CartWebInPort
public class CartDetailListInPort implements CartDetailListUseCase {

    private final CartDetailListOutPort cartDetailListOutPort;

    /**
     * 기능: cart에 담긴 모든 상품을 조회할 수 있습니다.
     *      -> domain vo를 response dto로 변경합니다.
     */
    @Override
    public List<CartDetailListResponseDTO> findAll() {

        // domain vo를 거쳐 out port를 구현한 out adapter를 실행하여 DB데이터를 조회한다.
        List<CartDomainDetailListResponseDTO> cartDomainDetailListResponseDto = cartDetailListOutPort.findAll();

        // domain vo를 response dto로 변경한다.
        ModelMapper mapper = new ModelMapper();

        List<CartDetailListResponseDTO> cartDetailListResponseDtoList = cartDomainDetailListResponseDto.stream()
                .map(data -> mapper.map(data, CartDetailListResponseDTO.class))
                .collect(toList());

        return cartDetailListResponseDtoList;
    }







}
