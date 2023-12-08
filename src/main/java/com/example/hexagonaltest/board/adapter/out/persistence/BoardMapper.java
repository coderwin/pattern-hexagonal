package com.example.hexagonaltest.board.adapter.out.persistence;

import com.example.hexagonaltest.board.adapter.in.web.dto.BoardInputDTO;
import com.example.hexagonaltest.board.domain.Board;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * 설명 : BoardMapper
 *      -> 원래는 계층하나하나마다 DTO가 필요하다.
 *
 *      -> 여기서 Board와 BoardEntity를 만드는 것인가?
 *
 */
@Component
public class BoardMapper {

    /**
     * 설명 : 그러면 본래는 BoardInputDTO가 아니라 BoardOuptDTO로 만들어야 하는 것인가?
     */
    public BoardEntity domainToEntity(Board board) {

        ModelMapper mapper = new ModelMapper();
        BoardEntity boardEntity = mapper.map(board, BoardEntity.class);
        return boardEntity;
    }

    public BoardResponseDTO EntityToDomain(BoardEntity entity) {

        ModelMapper mapper = new ModelMapper();
        BoardResponseDTO board = mapper.map(entity, BoardResponseDTO.class);
        return board;
    }


}
