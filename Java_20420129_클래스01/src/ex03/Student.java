package ex03;

public class Student {
	
	private String name;
	private String studentId;
	private String major;

	Student() {}
	
	Student(String n, String s, String m){
		name = n;
		studentId = s;
		major =m;
	}
	
	void displayInfomation(){
		System.out.println("학번: "+ studentId);
		System.out.println("이름: "+ name);
		System.out.println("전공: "+ major);
	}
		
	
	
		
		
}
