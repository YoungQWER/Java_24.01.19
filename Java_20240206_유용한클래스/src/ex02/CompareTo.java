package ex02;

public class CompareTo {

	public static void main(String[] args) {
		System.out.println(compareEx("kor", "eng"));     // > 양수
		System.out.println(compareEx("kor", "math"));    // < 음수
		System.out.println(compareEx("kor", "kor"));     // = 0
	}

	static int compareEx(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
