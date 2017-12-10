package com.lime_it.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lime_it.dao.ClassDAO;
import com.lime_it.domain.ClassVO;
import com.lime_it.domain.OneVO;

@Service
public class OneServiceImpl {

	@Autowired
	private ClassDAO classDAO;
	
	public List<OneVO> SessionPoint() {
		String arrYear[] = new String[6];
		arrYear[0]="2013";arrYear[1]="2014";arrYear[2]="2015";arrYear[3]="2016";arrYear[4]="2017";arrYear[5]="2018";
		String arrTerm[] = new String[2];
		arrTerm[0]="1"; arrTerm[1]="2";
		
		List<OneVO> oneList = new ArrayList<OneVO>();
		for(int i=0; i< 6; i++)
			for(int j=0; j<2; j++)
				oneList.add(new OneVO(arrYear[i], arrTerm[j], 0));
		int k=0;
		for(int i=0; i<6; i++){
			for(int j =0; j<2; j++){
				OneVO vo = oneList.get(k);
				List<ClassVO> classList = classDAO.getTheClass();
				for(ClassVO classVO : classList){
					if(classVO.getClass_Year().equals(vo.getClass_Year()) && classVO.getClass_Term().equals(vo.getClass_Term())){
						vo.setClass_Point((vo.getClass_Point()+classVO.getClass_Point()));
					}
				}
				oneList.remove(k);
				oneList.add(k, vo);
				k++;
			}
		}
		return oneList;
	}
}
