package kr.co.bit.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.bit.domain.vo.board.BoardItemVo;
import kr.co.bit.domain.dao.board.BoardDao;

@Controller
public class BoardController {
	@Autowired
	BoardDao boardDao;
	@RequestMapping("/board")
	public String showBoard(){
		
		List<BoardItemVo>boardItemVos = boardDao.selectAll();
		System.out.println(boardItemVos.get(0).toString());
		return "board";
	}
}
