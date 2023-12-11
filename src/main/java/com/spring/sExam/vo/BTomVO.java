package com.spring.sExam.vo;

import lombok.Data;

//@Getter
//@Setter
//@ToString

@Data
public class BTomVO {
	private String name;
	private int age;
	private String mid;
	private String pwd;
	private String gender;
	private String address;
	
	private String job;
//	롬북 특성 두번째 글자가 대문자면 첫번째 글자도 대문자여야함 jsp도 마찬가지
	private String WDate;
	
}
