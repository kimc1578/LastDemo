package kr.co.bit.domain.dao.board;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.kr.bit.domain.vo.board.BoardItemVo;


public interface BoardDao {
	public List<BoardItemVo> selectAll();

}
