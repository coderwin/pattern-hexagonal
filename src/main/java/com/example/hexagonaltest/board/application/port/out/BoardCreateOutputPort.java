package com.example.hexagonaltest.board.application.port.out;

import com.example.hexagonaltest.board.adapter.in.web.dto.BoardInputDTO;
import com.example.hexagonaltest.board.domain.Board;

/**
 * 설명 : BoardCreateOutputPort
 *       -> 아웃풋 포트
 */
public interface BoardCreateOutputPort {

    String createBoard(Board board);
}
