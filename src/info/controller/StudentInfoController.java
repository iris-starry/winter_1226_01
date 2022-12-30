package info.controller;

import java.util.ArrayList;

import info.view.StudentView;
import info.vo.SchoolInfo;
import info.vo.StudentDAO;
import info.vo.StudentVo;

import java.util.Scanner;

public class StudentInfoController {
	public static final int CONTINUE = 1;
	public static final int EXIT = 0;
	
	ArrayList<StudentVo> svoList;

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in); //String
		Scanner s2 = new Scanner(System.in); //int
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> stuIds = new ArrayList<Integer>();
		ArrayList<Integer> grades = new ArrayList<Integer>();
		ArrayList<String> majors = new ArrayList<String>();
		ArrayList<String> mobiles = new ArrayList<String>();
		ArrayList<String> address = new ArrayList<String>();
		
		int flag = CONTINUE;
		//학생 정보 입력
		System.out.println("===== 학생 정보 입력 화면 =====");
		while(true){
			if(flag==1) {
				System.out.println("성명");
				names.add(s2.next());
				
				System.out.println("학번");
				stuIds.add(s1.nextInt());
				
				System.out.println("학년");
				grades.add(s1.nextInt());
				
				System.out.println("전공");
				majors.add(s2.next());
				
				System.out.println("핸드폰");
				mobiles.add(s1.next());
				
				System.out.println("주소");
				address.add(s2.next());
				
				
			}else if(flag == EXIT){
				break;
			}
			
			System.out.println("계속 입력하시겠습니까?(계속: 1, 종료: 0): ");
			flag = s2.nextInt();
			System.out.println("----------------------------------------------------------------");
			
		}
		
		//컨트롤러에 참조...?
		//StudentInfoController controller = new StudentInfoController();
		StudentDAO dao = new StudentDAO();
		
		for(int i=0; i< names.size(); i++) {
			StudentVo svo = new StudentVo(names.get(i), stuIds.get(i), grades.get(i), majors.get(i), mobiles.get(i), address.get(i));
			dao.insert(svo);
		}
		
		//controller.svoList = dao.select();
		
		//화면 출력
		StudentView stuView = new StudentView();
		stuView.View(dao.select());
		
		//scanner 닫기 가동성을 위해서..maybe
		s1.close();
		s2.close();
		
			
	}

}
