package com.jose1593.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	
	@Autowired
	private BoardService boardService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/board")
	public ModelAndView board() {
		ModelAndView mv = new ModelAndView("board"); // board.jsp로 값이 날라감
		int toSize = boardService.toSize();
		mv.addObject("toSize", toSize);
		
		return mv;
	}
	
}
