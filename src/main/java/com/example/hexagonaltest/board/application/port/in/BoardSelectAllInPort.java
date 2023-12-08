package com.example.hexagonaltest.board.application.port.in;

import com.example.hexagonaltest.board.adapter.out.persistence.BoardSelectAllOutAdapter;
import com.example.hexagonaltest.board.application.usecase.BoardSelectAllUseCase;
import com.example.hexagonaltest.board.domain.BoardListDetailResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class BoardSelectAllInPort implements BoardSelectAllUseCase {

    private final BoardSelectAllOutAdapter boardSelectAllOutAdapter;// select out adapter

    @Override
    public List<BoardListDetailResponseDTO> findAll() {

        List<BoardListDetailResponseDTO> boardListDto = boardSelectAllOutAdapter.findAll();

        return boardListDto;
    }





}
