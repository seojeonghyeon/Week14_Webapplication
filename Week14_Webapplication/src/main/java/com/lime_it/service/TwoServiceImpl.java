package com.lime_it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lime_it.dao.ClassDAO;
import com.lime_it.domain.ClassVO;
import com.lime_it.domain.TwoVO;

@Service
public class TwoServiceImpl {
	
	@Autowired
	private ClassDAO classDAO;
	
	public TwoVO SessionSection() {
		int sum = 0;
		TwoVO vo= new TwoVO();
		vo.setGi(0); vo.setHac(0); vo.setJi(0); vo.setKu(0); vo.setSun(0);
		List<ClassVO> classList = classDAO.getTheClass();
		for(ClassVO classVO : classList){
				if(classVO.getClass_Section().equals("교필")){
					vo.setKu(classVO.getClass_Point()+vo.getKu());
				}else if(classVO.getClass_Section().equals("핵교")){
					vo.setHac(classVO.getClass_Point()+vo.getHac());
				}else if(classVO.getClass_Section().equals("전지")){
					vo.setJi(classVO.getClass_Point()+vo.getJi());
				}else if(classVO.getClass_Section().equals("전기")){
					vo.setGi(classVO.getClass_Point()+vo.getGi());
				}else if(classVO.getClass_Section().equals("전선")){
					vo.setSun(classVO.getClass_Point()+vo.getSun());
				}else if(classVO.getClass_Section().equals("자율")){
					vo.setJa(classVO.getClass_Point()+vo.getJa());
				}
				sum += classVO.getClass_Point();
		}
		vo.setSum(sum);
		return vo;
	}

}
