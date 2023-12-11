package com.example.hexagonaltest.board.adapter.in.web;

import com.example.hexagonaltest.board.adapter.in.web.dto.BoardInputDTO;
import com.example.hexagonaltest.board.application.usecase.BoardCreateUseCase;
import com.example.hexagonaltest.common.WebInAdapter;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 설명 : BoardController
 *       -> int 바운드 어댑터
 */
@WebInAdapter // 우리가 만든 어노테이션 in바운더라는 것을 명시, 알려준다.
@RequestMapping("/boards")
@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardCreateUseCase boardCreateUseCase;

    @Operation(
            summary = "게시글 등록",
            description = "writer, title을 등록할 수 있습니다.",
            tags = {"CartDetailInAdapter"}
    )
    @PostMapping
    public void create(@RequestBody BoardInputDTO boardInputDTO) {

        boardCreateUseCase.createBoardData(boardInputDTO);
    }


}
