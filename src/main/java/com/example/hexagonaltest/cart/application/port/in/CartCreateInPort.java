package com.example.hexagonaltest.cart.application.port.in;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartCreateRequestDTO;
import com.example.hexagonaltest.cart.application.port.out.CartCreateOutPort;
import com.example.hexagonaltest.cart.application.usecase.CartCreateUseCase;
import com.example.hexagonaltest.cart.common.CartWebInPort;
import com.example.hexagonaltest.cart.domain.CartDomainCreateRequestDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
@CartWebInPort
public class CartCreateInPort implements CartCreateUseCase {

    private final CartCreateOutPort cartCreateOutPort;

    /**
     * 기능 : 상품 담기(생성)
     */
    public void create(CartCreateRequestDTO request) {

        ModelMapper mapper = new ModelMapper();

        // domain의 CartDomainCreateRequestDTO로 변경한다.
        CartDomainCreateRequestDTO domainRequest = mapper.map(request, CartDomainCreateRequestDTO.class);

        /// out adapter 에서 함께 처리한다.
        // domain을 생성한다.
        // application을 거친다.
        // out port로 보낸다.
        // out adapter로 보낸다.
        cartCreateOutPort.create(domainRequest);

    }




}
