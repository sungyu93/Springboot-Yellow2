package site.metacoding.yellow.web;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.metacoding.yellow.domain.Board;

@Controller
public class BoardController {

	@GetMapping("/board") 
	public String getBoard(Model model) {
		// 더미 데이터 만들기
		List<Board> boardList = new ArrayList<>();
		boardList.add(new Board(1, "스프링 1강", "컨트롤러 배우기"));
		boardList.add(new Board(2, "스프링 2강", "템플릿 엔진 배우기"));
		boardList.add(new Board(3, "스프링 3강", "디비 연결 배우기"));
		// mvc 패턴 
		
		model.addAttribute("boards", boardList);
		return "/board/list";
	}
	
	@GetMapping("/board/{id}")
	public String getBoardone(@PathVariable Integer id, Model model) {
		// 더미 데이터 만들기
		List<Board> boardList = new ArrayList<>();
		// id가 1이면 35번줄을 담고, id가 2이면 36번 줄을 담고, id가 3이면 37번 줄을 담음
		if(id == 1) {
			model.addAttribute("board", new Board(1, "스프링 1강", "컨트롤러 배우기"));
		}if(id == 2){
			model.addAttribute("board", new Board(2, "스프링 2강", "템플릿 엔진 배우기"));
		}if(id == 3) {
			model.addAttribute("board", new Board(3, "스프링 3강", "디비 연결 배우기"));
		}
		return "/board/detail";
	}
}
