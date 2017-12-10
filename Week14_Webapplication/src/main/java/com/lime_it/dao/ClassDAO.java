package com.lime_it.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lime_it.domain.ClassVO;

@Repository
public class ClassDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		System.out.println("Okay1");
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public List<ClassVO> getTheClass() {
		String sqlStatement = "select * from tbl_Class";
		System.out.println("Okay2");
		return jdbcTemplate.query(sqlStatement, 
				new RowMapper<ClassVO>() {
				public ClassVO mapRow(ResultSet rs, int rowNum) throws SQLException {
					System.out.println("Okay3");
					ClassVO classVO = new ClassVO();
					System.out.println("Okay4");
					classVO.setClass_Code(rs.getString("class_Code"));
					classVO.setClass_Section(rs.getString("class_Section"));
					classVO.setClass_Term(rs.getString("class_Term"));
					classVO.setClass_Title(rs.getString("class_Title"));
					classVO.setClass_Year(rs.getString("class_Year"));
					classVO.setClass_Point(rs.getInt("class_Point"));
					System.out.println("Okay5");
					return classVO;
				}
			}
		);
	}
	
	public boolean insertTheClass(ClassVO classVO){
		String class_Code= classVO.getClass_Code();
		String class_Section = classVO.getClass_Section();
		String class_Term = classVO.getClass_Term();
		String class_Title = classVO.getClass_Title();
		String class_Year = classVO.getClass_Year();
		int class_Point = classVO.getClass_Point();
		
		String sqlStatement = "INSERT INTO tbl_Class "
				+ "(class_Year, class_Term, class_Code, class_Title, class_Section, class_Point) "
				+ "VALUES (?, ?, ?, ?, ?, ?);";
		
		return (jdbcTemplate.update(sqlStatement, new Object[]{class_Year, class_Term, class_Code, class_Title, class_Section, class_Point}) == 1);
	}

}
