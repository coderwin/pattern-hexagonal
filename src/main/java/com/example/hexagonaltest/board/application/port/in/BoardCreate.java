package com.example.hexagonaltest.board.application.port.in;

import com.example.hexagonaltest.board.adapter.in.web.dto.BoardInputDTO;
import com.example.hexagonaltest.board.application.port.out.BoardCreateOutputPort;
import com.example.hexagonaltest.board.application.usecase.BoardCreateUseCase;
import com.example.hexagonaltest.board.domain.Board;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 설명 : BoardCreate (BoardCreateServicce)
 *       -> 외부 어댑터에 의해 호출되는 input port의 구현체
 */
@RequiredArgsConstructor
@Transactional
@Service
public class BoardCreate implements BoardCreateUseCase {

    private final BoardCreateOutputPort outputPort;

    @Override
    public String createBoardData(BoardInputDTO boardInputDto) {
        // domain의 Board로 교체한다.
        ModelMapper mapper = new ModelMapper();
        Board board = mapper.map(boardInputDto, Board.class);

        return outputPort.createBoard(board);
    }
}
