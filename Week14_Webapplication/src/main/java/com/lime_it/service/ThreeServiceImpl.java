package com.lime_it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lime_it.dao.ClassDAO;
import com.lime_it.domain.ClassVO;

@Service
public class ThreeServiceImpl {
	
	@Autowired
	private ClassDAO classDAO;
	
	public void InsertTheClass(ClassVO classVO) {
		boolean result = classDAO.insertTheClass(classVO);
		System.out.println(result);
	}

}
