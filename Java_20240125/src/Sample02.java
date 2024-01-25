
public class Sample02 {

	public static void main(String[] args) {
		/*
		 * 메서드명 : change
		 * 매개변수 : int
		 * 반환타입 : int[]
		 * 기능 : change함수 정수값을 전달하면, 그 정수 수 만큼 배열크기를 생성해서 전달
		 * 배열안에는 1~10까지 난수 입력
		 */
		System.out.println("정수전달하면 정수크기만큼 배열을 생성해서 돌려준다");
		
		int[] abs = change(10);
		
		for(int i=0; i<abs.length; i++)          //정해준 배열크기 생성
			System.out.print(abs[i] + " ");
		
		
	}
		static int[] change(int num){
			int[] abs = new int[num];               //배열안으로 전달
			
			for(int i=0; i<abs.length; i++)         //정수값 뽑아서 전달
				abs[i] = (int)(Math.random()*10)+1;
			
			return abs;
		}
		
	
	
	
}
