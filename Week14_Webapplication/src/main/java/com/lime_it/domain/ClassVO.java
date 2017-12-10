package com.lime_it.domain;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ClassVO {
	@Size(min=1, max=10, message="Year must between 1-10 chars")
	private String class_Year;
	@Size(min=1, max=10, message="Term must between 1-10 chars")
	private String class_Term;
	@Size(min=1, max=100, message="Code must between 1-100 chars")
	private String class_Code;
	@Size(min=1, max=100, message="Title must between 1-100 chars")
	private String class_Title;
	@Size(min=1, max=100, message="Section must between 1-100 chars")
	private String class_Section;
	
	private int class_Point;
}
