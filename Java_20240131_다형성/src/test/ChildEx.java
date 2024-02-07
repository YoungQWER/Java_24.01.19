package test;

public class ChildEx {

	public static void main(String[] args) {

		Parent parent = new Child(); //자동타입변환
		parent.field1 = "xxx";
		parent.method1();
		parent.method2();
//		parent.field2 = "yyy"; 			//불가능
//		parent.method3();      			//불가능
		
		Child child = (Child) parent;
		child.field2 = "yyy";   			//가능
		child.method3();		            //가능
		
	}

}
