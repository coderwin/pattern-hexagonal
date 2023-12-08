package com.example.hexagonaltest.board.adapter.out.persistence;

import com.example.hexagonaltest.board.application.port.out.BoardCreateOutputPort;
import com.example.hexagonaltest.board.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 설명 : JPABoardOutputAdapter
 *       -> 레이아웃에서
 *          DAOImpl의 역할이다.
 *       -> persistence는 persistence(Repository)로 나간다
 *
 *
 *       -> ******** 여기서부터 다시 적어보자 *******
 *          -> 현재 막힌부분
 *          -> 여기는 out adapter인데 outPut port를 거치지 않았다.
 *          -> BoardCreateOutputPort의 구현체가 보이지 않는다.
 */
@RequiredArgsConstructor
@Service// service인가?
public class JPABoardOutputAdapter implements BoardCreateOutputPort {

    private final BoardRepository boardRepository;// 데이터를 db에 저장한다.
    private final BoardMapper boardMapper;// 데이터를 교체한다.

    @Override
    public String createBoard(Board board) {
        // vo를 entity로 변경한다.
        BoardEntity boardEntity = boardMapper.domainToEntity(board);
        // entity를 port out을 타고 in out으로 나가면 된다.
        boardRepository.save(boardEntity);
        return "ok";
    }



}
