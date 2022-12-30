package info.vo;

import java.util.ArrayList;

// ArrayList : 여러명의 학생 정보를 저장하기 위해 필요
public class StudentDAO {
	ArrayList<StudentVo> svoList = new ArrayList<StudentVo>();
	//insert() : 학생정보 객체 참조값을 ArrayList에 추가
	//동적으로 저장하기 위해서 
	public void insert(StudentVo svo) {
		svoList.add(svo);
	}
	//select() : 학생정보들이 저장된 ArrayList객체 참조값을 반환
	public ArrayList<StudentVo> select(){
		return svoList;
	}

}
