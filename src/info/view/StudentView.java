package info.view;

import java.util.ArrayList;

import info.vo.SchoolInfo;
import info.vo.StudentVo;

//학생 정보를 출력하는 Object
public class StudentView {
	public void View(ArrayList<StudentVo> svoList) {
		System.out.println("학교명: "+SchoolInfo.SCHOOL_NAME);
		//개선된(enhanced) for문
		for(StudentVo svo : svoList) {
			System.out.print("성명: "+svo.getName()+"\t");
			System.out.print("학번: "+svo.getStuid()+"\t");
			System.out.print("학년: "+svo.getGrade()+"\t");
			System.out.print("전공: "+svo.getMajor()+"\n");
			System.out.print("핸드폰: "+svo.getMobile()+"\n");
			System.out.print("주소: "+svo.getAddress()+"\n");
		}
		System.out.println("학교전화: "+SchoolInfo.PHONE_NUMBER);
		System.out.println("주소: "+SchoolInfo.SCHOOL_ADDRESS);
	}
}
