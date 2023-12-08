package com.example.hexagonaltest.board.application.usecase;

import com.example.hexagonaltest.board.domain.BoardDetailResponseDTO;
import org.springframework.stereotype.Service;

public interface BoardSelectUseCase {

    public BoardDetailResponseDTO select(Long id);
}
