package com.study.student.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.study.student.dao.IStudentDao;
import com.study.student.vo.StudentVO;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Inject
	IStudentDao studentDao; 
	
	@Override
	public List<StudentVO> getStudentList() {
		// Dao에 있는 getStudentList()라는 메서드 실행 (mybatis 만들기)
		return studentDao.getStudentList();
	}


}
