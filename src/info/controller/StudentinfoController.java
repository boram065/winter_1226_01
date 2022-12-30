package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.view.StudentView;
import info.vo.StudentDAO;
import info.vo.StudentVO;

public class StudentinfoController {
	public static final int CONTINUE = 1;
	public static final int EXIT = 0;

	public static void main(String[] args) {
		
		//원하는만큼 저장할 수 있는 ArrayList 생성
		ArrayList<String> names = new ArrayList<String>();
	 	ArrayList<Integer> stuIds = new ArrayList<Integer>();
	 	ArrayList<Integer> grades = new ArrayList<Integer>();
	 	ArrayList<String> majors = new ArrayList<String>();
	 	ArrayList<String> address = new ArrayList<String>();
	 	ArrayList<String> mobiles = new ArrayList<String>();
	 	
	 	Scanner s1 = new Scanner(System.in); //정수입력
	 	Scanner s2 = new Scanner(System.in); //문자열 입력
	 	
	 	int flag = CONTINUE;
	 	while(true) {
	 		//개선된(enhanced) for문
	 		if(flag == CONTINUE) {
	 			//학생 정보 입력
				System.out.print("성명 : ");
				names.add(s2.next());
				System.out.print("학번 : ");
				stuIds.add(s1.nextInt());
				System.out.print("학년 : ");
				grades.add(s1.nextInt());
				System.out.print("전공 : ");
				majors.add(s2.next());
				System.out.print("주소 : ");
				address.add(s2.next());
				System.out.print("핸드폰 번호 : ");
				mobiles.add(s1.next());	
	 		} else if(flag == EXIT) {
	 			break;
	 		}//if
	 		
	 		//1번 : 반복 / 0번 : 종료
	 		System.out.print("계속 입력하시겠습니까?(계속:1, 종료:0) : ");
	 		flag = s1.nextInt();
	 		System.out.println("=====================================");
	 	}//while
		
	 	//StudentDAO클래스 불러오기
		StudentDAO dao = new StudentDAO();
		
		//입력된 학생 정보 출력
		for(int i = 0; i < names.size(); i++) {
			//i번째 방에 있는 ArrayList를 넘기기
			StudentVO svo = new StudentVO(names.get(i), stuIds.get(i), grades.get(i), majors.get(i), address.get(i), mobiles.get(i));
			dao.insert(svo);
		}//for
		
		//화면 출력
		StudentView stuview = new StudentView();
		stuview.view(dao.select());
		s1.close();
		s2.close();
		
	}//main
}//class

