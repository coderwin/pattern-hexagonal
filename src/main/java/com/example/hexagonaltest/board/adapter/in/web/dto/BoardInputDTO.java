package com.example.hexagonaltest.board.adapter.in.web.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 설명 : BoardInputDTO
 *       -> 외부 요청에서 받은 데이터를 이동시킴
 */
@Getter
public class BoardInputDTO {

    @Setter
    private String writer;
    @Setter
    private String title;
    private String content;
}
