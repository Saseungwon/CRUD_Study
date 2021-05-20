// 1 StudentController 만들기
package com.study.student.web;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.student.service.IStudentService;
import com.study.student.vo.StudentVO;

@Controller
public class StudentController {

	@Inject
	IStudentService studentService; 
	
	
	@RequestMapping("/student/studentList.do")
	public String studentList(Model model) { 		// 3 (Model model)
		//service의 getStudentList를 실행해서 List<StudentVO>를 리턴 받을 겁니다. 
		//그 list를 model에 담아둡니다. 
		//model 담은 걸 studentList.jsp에서 EL로 사용 
		//우리가 할 건 model에 담아주기만 하면 된다. 그래서 public String studentList(model)이라고 쓰는 
		
		//StudentVO에 있는 List를 받아야된다. 그리고 IStudentService에 있는 getStudentList() 실행해줌
							//studentList는 DB에서 담아온 값들
		List<StudentVO> studentList= studentService.getStudentList(); 
		model.addAttribute("studentList", studentList); //jsp에서 EL로 {studentList}
		return "student/studentList";
	}
	
	@RequestMapping("/student/studentView.do")
	public String studentView() {
		return "student/studentView"; 
			
	}
	
	@RequestMapping("/student/studentEdit.do")
	public String studentEdit() {
		return "student/studentEdit"; 
			
	}
	
	//Edit 했을 때 갈 페이지 만들기(Modify)	
	@RequestMapping("/student/studentModify.do")
	public String studentModify() {
		return "home"; 
			
	}
	
}
