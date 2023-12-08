package com.example.hexagonaltest.board.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 설명 : 외부에 의해 오염이 되면 안된다.
 *       -> 외부의 영향으로 인해 데이터가 변하면 안 된다.
 *
 */
@Getter
public class Board {

    @Setter
    private String writer;
    private String title;
    @Setter
    private String content;
}
