package com.example.hexagonaltest.cart.application.port.out;

import com.example.hexagonaltest.cart.common.CartWebOutPort;
import com.example.hexagonaltest.cart.domain.CartDomainCreateRequestDTO;

/**
 * 설명 : Cart create out port
 *      -> out adapter로 보낼 create DTO 생성
 */
@CartWebOutPort
public interface CartCreateOutPort {

    /**
     * 기능 : entity를 생성한다.
     * @param domainRequest
     */
    void create(CartDomainCreateRequestDTO domainRequest);
}
