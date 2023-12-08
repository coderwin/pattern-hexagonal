package com.example.hexagonaltest.board.adapter.out.persistence;

import com.example.hexagonaltest.board.application.port.out.BoardSelectOutputPort;
import com.example.hexagonaltest.board.domain.BoardDetailResponseDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardSelectOutputAdapter implements BoardSelectOutputPort {

    private final BoardRepository boardRepository;// 데이터를 db에서 조회한다.

    @Override
    public BoardDetailResponseDTO select(Long id) {

        // db에서 데이터 조회한다.
        BoardEntity boardEntity = boardRepository.findById(id).orElseThrow(() -> {
            String errMsg = "없는 사용자";
            return new IllegalArgumentException(errMsg);
        });
        // BoardDetailResponseDTO로 변환하기
        ModelMapper mapper = new ModelMapper();
        BoardDetailResponseDTO response = mapper.map(boardEntity, BoardDetailResponseDTO.class);
        return response;
    }
}
