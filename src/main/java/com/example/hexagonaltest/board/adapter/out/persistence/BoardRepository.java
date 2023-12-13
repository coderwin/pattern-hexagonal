package com.example.hexagonaltest.board.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 설명 : BoardRepository
 *      -> outer에 위치
 */
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
