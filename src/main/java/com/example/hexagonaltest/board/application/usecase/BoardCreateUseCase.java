package com.example.hexagonaltest.board.application.usecase;

import com.example.hexagonaltest.board.adapter.in.web.dto.BoardInputDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * 설명 : BoardCreateUseCase
 *       -> service, usecase에 위치 가능
 *       -> port in
 *       -> port 인바운드 역할
 *       -> 예시) service단의 인터페이스
 */
public interface BoardCreateUseCase {
    String createBoardData(BoardInputDTO boardInputDto);
}
