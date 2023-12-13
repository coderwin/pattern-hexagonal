package com.example.hexagonaltest.board.application.usecase;

import com.example.hexagonaltest.board.domain.BoardListDetailResponseDTO;

import java.util.List;

public interface BoardSelectAllUseCase {
    List<BoardListDetailResponseDTO> findAll();
}
