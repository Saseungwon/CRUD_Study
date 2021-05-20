package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. @Controller는 url을 가지고 매핑을 시켜주는 역할을 한다. 
@Controller

// 2. /board 라는 게 나오면 @Controller가 잡아간다. 
@RequestMapping("/board")
public class BoardController {
	
	//내가 url 지정해줌
	@GetMapping("/list.wow")
	
// 3. 실행할 메서드 만들기(여기 있는 것들은 WEB-INF/views/ 밑에 있는 것들 찾음)
	public String list() {
		System.out.println("BoardController.list()");
		// mvc-servlet.xml에 있는 ViewResolver가 가져간다. 
		// /WEB-INF/views/ + board/list.jsp를 실행시킨다. 
		return "board/list";
	}
}
