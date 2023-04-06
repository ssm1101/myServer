package com.example.demo.emp.service;

import java.util.List;

public interface EmpService {
	public List<EmpVO> getAllList();
	public int insertEmpInfo(EmpVO empVO);
	public EmpVO getEmpInfo(int empId);
}
