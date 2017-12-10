package com.lime_it.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lime_it.dao.ClassDAO;
import com.lime_it.domain.ClassVO;

@Service
public class FourServiceImpl {

	@Autowired
	private ClassDAO classDAO;
	
	public List<ClassVO> Bring2018() {
		List<ClassVO> fourList = new ArrayList<ClassVO>();
		List<ClassVO> classList = classDAO.getTheClass();
		for(ClassVO classVO : classList){
			if(classVO.getClass_Year().equals("2018")){
				fourList.add(classVO);
			}
		}
		return fourList;
	}

}
