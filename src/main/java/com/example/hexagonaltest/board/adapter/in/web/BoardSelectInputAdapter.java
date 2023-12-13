package com.example.hexagonaltest.board.adapter.in.web;

import com.example.hexagonaltest.board.application.usecase.BoardSelectUseCase;
import com.example.hexagonaltest.board.domain.BoardDetailResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/boards")
@RestController
public class BoardSelectInputAdapter {

    private final BoardSelectUseCase boardSelectUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<BoardDetailResponseDTO> select(@PathVariable Long id) {

        BoardDetailResponseDTO body = boardSelectUseCase.select(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(body);
    }





}
