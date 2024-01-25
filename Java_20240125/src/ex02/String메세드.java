package ex02;

public class String메세드 {

	public static void main(String[] args) {
		String str = "korea";                //0,1,2,3,4
		String str2 = "";
		String str3 = str.substring(2);
		
		System.out.println(str.length());    //문자열 길이 확인
		System.out.println(str.isEmpty());   //안에 비어있나 확인
		System.out.println(str2.isEmpty());
		System.out.println(str.substring(2)); //0,1,2 번째 글부터 나열
		System.out.println(str3);

		System.out.println(str.substring(1,4)); // 1부터 4전까지 출력
		
		String str4 = "math";
		String str5 = str.concat(str4);         
		
		System.out.println(str.concat(str4));     //str값에 str4를 나열
		System.out.println(str5);
		System.out.println(str.concat("\t"+str4));  //사이에 탭
		
		
		
	}

}
