package com.example.demo.emp.mapper;

import java.util.List;

import com.example.demo.emp.service.EmpVO;

public interface EmpMapper {
	public List<EmpVO> selectAllEmpList();
	public int insertEmpInfo(EmpVO empVO);
	public EmpVO selectEmpInfo(int empId);
}
