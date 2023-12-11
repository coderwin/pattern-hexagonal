package com.example.hexagonaltest.board.application.port.in;

import com.example.hexagonaltest.board.adapter.in.web.dto.BoardInputDTO;
import com.example.hexagonaltest.board.application.port.out.BoardCreateOutputPort;
import com.example.hexagonaltest.board.application.usecase.BoardCreateUseCase;
import com.example.hexagonaltest.board.domain.Board;
import com.example.hexagonaltest.kafkatest.adapter.out.KafkaProducerOutputAdapter;
import com.example.hexagonaltest.kafkatest.application.port.out.KafkaEventOutPort;
import com.fasterxml.jackson.core.JsonProcessingException;
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

    // 역할
    // DBMS와 통신한는 output port
    // Kafka와 통신하는 output port
    private final BoardCreateOutputPort outputPort;
    private final KafkaEventOutPort kafkaOutPort;

    @Override
    public String createBoardData(BoardInputDTO boardInputDto) {
        // domain의 Board로 교체한다.
        ModelMapper mapper = new ModelMapper();
        Board board = mapper.map(boardInputDto, Board.class);

        // DBMS와 통신한다.
        outputPort.createBoard(board);
        // kafka와 통신한다.
        try {
            kafkaOutPort.boardWriteEvent("wirte ok");
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(e);
        }

        return outputPort.createBoard(board);
    }
}
