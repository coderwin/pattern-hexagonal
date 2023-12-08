package com.example.hexagonaltest.cart.application.port.out;

import com.example.hexagonaltest.cart.common.CartWebOutPort;
import com.example.hexagonaltest.cart.domain.CartDomainDetailListResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 설명 : Cart Detail List out port
 *       -> out adapter를 실행한다??????
 */
@CartWebOutPort(value = {1, 2})
public interface CartDetailListOutPort {

    /**
     * 설명 : 상품 모든 데이터를 조회한다.
     * @return
     */
    List<CartDomainDetailListResponseDTO> findAll();
}
