package com.example.hexagonaltest.board.application.port.in;

import com.example.hexagonaltest.board.application.port.out.BoardSelectOutputPort;
import com.example.hexagonaltest.board.application.usecase.BoardSelectUseCase;
import com.example.hexagonaltest.board.domain.BoardDetailResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class BoardSelect implements BoardSelectUseCase {

    private final BoardSelectOutputPort boardSelectOutputPort;

    @Override
    public BoardDetailResponseDTO select(Long id) {
        BoardDetailResponseDTO response = boardSelectOutputPort.select(id);
        return response;
    }




}
