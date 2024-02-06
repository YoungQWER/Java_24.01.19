package ex01;

import java.util.regex.*;    //Pattern과 Matcher가 속한 패키지 514p

class RegularEx01 {

	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca",
				"co", "c.","cO", "car", "combat", "count", "data", "disc"};
		Pattern p = Pattern.compile("c[a-z]*");  // c로 시작하는 소문자영단어 //2번째부턴 영문자시작
		
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i] + ","); 
		}
	}
}
