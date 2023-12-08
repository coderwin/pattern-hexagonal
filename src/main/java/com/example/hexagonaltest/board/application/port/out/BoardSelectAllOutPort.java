package com.example.hexagonaltest.board.application.port.out;

import com.example.hexagonaltest.board.domain.BoardListDetailResponseDTO;

import java.util.List;

public interface BoardSelectAllOutPort {
    List<BoardListDetailResponseDTO> findAll();
}
