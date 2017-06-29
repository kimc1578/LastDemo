package kr.co.bit.domain.dao.board.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kr.bit.domain.vo.board.BoardItemVo;
import kr.co.bit.domain.dao.board.BoardDao;
@Repository
public class BoardDaoimpl implements BoardDao{
	@Autowired
	private SqlSession session;
	private String namespace = "kr.co.bit.mapper.BoardMapper";
	
	public List<BoardItemVo> selectAll(){
		
		
		
		return  session.selectList(namespace+".selectall");
		
	}

}
