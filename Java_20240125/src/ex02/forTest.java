package ex02;

public class forTest {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i % 3 == 0)
			sum += i;
		}
		System.out.println("1~100사이에 3배수의합 : "+sum);
		
		System.out.println("--------------------");
		
		int[] arr = {10,20,30};
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		int[] numArr =arr;
		for(int i=0; i<arr.length; i++)
			numArr[i] += 100;
		System.out.println();
		
//		for(int i=0; i<arr.length; i++)
//			System.out.println("arr[i]" +" ");      대신에
		for(int n : arr)
			System.out.print(n + " ");        //하나씩 가져온다	
			System.out.println();
		
		String[] str = {"kor","eng","math","com","sci"};
//		for(String s: str)
//			System.out.print(s+" ");
		for(int i=0; i<str.length; i++)
			System.out.print(str[i]+" ");
	}

}
