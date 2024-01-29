package ex03;
/*
 * 학생 클래스 만들기
 * 클래스 이름 : Student
 * 속성 :
 * name 이름
 * studentId 학번
 * major 전공
 */
public class 학생클래스만들기 {
	
	public static void main(String[] args) {
		
		Student stud1 = new Student(
				"조조",
				"12345",
				"조나라왕");           //인자값
		
		stud1.displayInfomation();
		
		
	}
	
}
