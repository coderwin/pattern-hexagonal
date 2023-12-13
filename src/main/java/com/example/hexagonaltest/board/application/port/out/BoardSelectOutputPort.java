package com.example.hexagonaltest.board.application.port.out;

import com.example.hexagonaltest.board.domain.BoardDetailResponseDTO;

/**
 * 설명 : 데이터 불러오기
 */
public interface BoardSelectOutputPort {
    BoardDetailResponseDTO select(Long id);
}
