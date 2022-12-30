package info.view;

import java.util.ArrayList;

import info.vo.Schoolinfo;
import info.vo.StudentVO;

//학생 정보를 출력하는 Object
public class StudentView {
	ArrayList<StudentVO> svoList = new ArrayList<StudentVO>();
	
	public void view(ArrayList<StudentVO> svoList) {
 		System.out.println("학교명 : " + Schoolinfo.SCHOOL_NAME);
       //개선된(enhanced) for문
       for(StudentVO svo : svoList) {
          System.out.print("성명:" + svo.getName() + "\t");
          System.out.print("학번:" + svo.getStuId() + "\t");
          System.out.print("학년:" + svo.getGrade() + "\t");
          System.out.print("전공:" + svo.getMajor() + "\t");
          System.out.print("주소:" + svo.getAddress() + "\t");
          System.out.print("핸드폰 번호:" + svo.getMobile() + "\n");
       }
       System.out.println("학교전화 : " + Schoolinfo.PHONE_NUMBER);
       System.out.println("학교주소 : " + Schoolinfo.SCHOOL_ADDRESS);
    }
	
	public ArrayList<StudentVO> select() {
		return svoList;
	}
}
