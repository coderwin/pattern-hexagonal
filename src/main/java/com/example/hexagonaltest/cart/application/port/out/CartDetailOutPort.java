package com.example.hexagonaltest.cart.application.port.out;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartDetailResponseDTO;
import com.example.hexagonaltest.cart.common.CartWebOutPort;
import com.example.hexagonaltest.cart.domain.CartDomainDetailResponseDTO;

/**
 * 기능 : Cart 상세보기 out port
 *       -> Cart in port에서 받은 데이터를
 *       -> domain vo로 변경합니다.
 */
@CartWebOutPort
public interface CartDetailOutPort {

    /**
     * 기능 : id로 조회할 수 있습니다.
     * @param id
     * @return
     */
    CartDomainDetailResponseDTO findById(Long id);
}
