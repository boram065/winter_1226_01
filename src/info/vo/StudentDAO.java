package info.vo;

import java.util.ArrayList;

//ArrayList : 여러명의 학생 정보를 저장하기 위해 필요함

public class StudentDAO {
	ArrayList<StudentVO> svoList = new ArrayList<StudentVO>();
	
	//insert() : 학생 정보 객체 참조값을 ArrayList에 추가하는 역할
	public void insert(StudentVO svo) {
		svoList.add(svo);
	}//void
	
	//select() : 학생 정보들이 저장된 ArrayList객체 참조값을 반환
	public ArrayList<StudentVO> select() {
		return svoList;
	}
}
