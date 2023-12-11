package com.spring.sExam.exam1211;

public class BMIService {

	public BMIVO calc(BMIVO vo) {
		int ret = vo.getWeight() / (vo.getHeight() / 100 * vo.getHeight() / 100);
		String grade = "";
		
		if(ret <= 18.5) { grade = "저체중"; }
		else if(ret > 18.5 && ret <= 23) { grade ="표준"; }
		else if(ret > 23 && ret <= 25) { grade ="과체중"; }
		else if(ret > 25) { grade ="과체중"; }
		
		vo.setRet(ret);
		vo.setGrade(grade);
		return vo;
	}
	
	public void printCalc(BMIVO vo) {
		System.out.println(vo.getName()+"/t"+vo.getWeight()+"/t"+vo.getHeight()+"/t"+vo.getGrade());
	}
}
