package com.example.hexagonaltest.board.adapter.in.web;

import com.example.hexagonaltest.board.application.port.in.BoardSelectAllInPort;
import com.example.hexagonaltest.board.domain.BoardListDetailResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/boards")
@RestController
public class BoardSelectAllInputAdapter {

    private final BoardSelectAllInPort boardSelectAllInPort;

    @GetMapping
    public ResponseEntity<List<BoardListDetailResponseDTO>> selectAll() {

        List<BoardListDetailResponseDTO> body = boardSelectAllInPort.findAll();

        return ResponseEntity.ok()
                .body(body);
    }






}
