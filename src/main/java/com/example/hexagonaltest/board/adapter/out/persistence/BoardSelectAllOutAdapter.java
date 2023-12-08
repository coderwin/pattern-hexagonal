package com.example.hexagonaltest.board.adapter.out.persistence;

import com.example.hexagonaltest.board.application.port.out.BoardSelectAllOutPort;
import com.example.hexagonaltest.board.domain.BoardListDetailResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@Service
public class BoardSelectAllOutAdapter implements BoardSelectAllOutPort {

    private final BoardRepository boardRepository;
    private final BoardMapper boardMapper;

    @Override
    public List<BoardListDetailResponseDTO> findAll() {

        // db에서 데이터를 조회한다.
        List<BoardEntity> boardEntityList = boardRepository.findAll();

        // dto lit로 변경한다.
        List<BoardListDetailResponseDTO> boardListDetailResponseDtoList =
                boardEntityList.stream()
                        .map(boardMapper::boardEntityToBoardListDetailResponseDTO)
                        .collect(toList());

        return boardListDetailResponseDtoList;


    }
}
