package com.study.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.student.vo.StudentVO;

@Mapper
public interface IStudentDao {
	public List<StudentVO> getStudentList(); 
	
}
