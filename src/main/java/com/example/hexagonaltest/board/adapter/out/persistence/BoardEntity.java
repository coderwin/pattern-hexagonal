package com.example.hexagonaltest.board.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "board")
@SequenceGenerator(
        name = "hexagonal-architect-board-seq",
        sequenceName = "hexagonal-board-seq",
        initialValue = 5,
        allocationSize = 11
)
public class BoardEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hexagonal-architect-board-seq")
    @Column(name = "board_id")
    private Long id;
    @Setter
    private String writer;
    private String title;
    private String content;



}
