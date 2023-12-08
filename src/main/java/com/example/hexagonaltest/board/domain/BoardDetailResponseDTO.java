package com.example.hexagonaltest.board.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDetailResponseDTO {

    private Long id;
    private String writer;
    private String title;
    private String content;
}
