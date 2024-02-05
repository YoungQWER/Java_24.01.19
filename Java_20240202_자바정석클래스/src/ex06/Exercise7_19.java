package ex06;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b= new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}


class Buyer{                                //고객
	int money=1000;							//소유금액
	Product[] cart = new Product[3];		//구입한 제품을 저장하기 위한 배열
	int i = 0;								//Product배열에 사용될 카운터
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println(p + "( " + p.price + " ) 을/를 사기에는 잔액이 부족합니다.");
			return;
		}
		money -= p.price;					//제품가격 빼기
		add(p);	                            //cart에 구입한 물건을 담는다(add메서드 호출)
	}
	
	void add(Product p) {					
		if(i >= cart.length) {				//i값이 장바구니 보다 크다면
			Product[] temp = new Product[cart.length*2];     //기존 장바구니보다 2배 큰 새로운 배열 생성
					for(int i=0; i<cart.length; i++)		 //기존 장바구니 내용을 새로운 배열에 복사
						temp[i] = cart[i];                   
						cart = temp;						 //새로운 장바구니와 기존의 장바구니를 바꾼다
		}
		cart[i++] = p;										 //물건을 장바구니에 저장
	}
		void summary() {           			//구매한 물품에 대한 정보를 요약해서 보여준다
			
		String itemList = "";
		int sum = 0;
											
		for(int i=0; i<cart.length; i++) {    
			itemList += cart[i] + ", ";			//장바구니에 담긴 물건들의 목록을 만들어 출력
			sum += cart[i].price;				//장바구니 담긴 물건들의 가격을 더해서 출력
		}
		System.out.println("구입한 물건의 목록 : " + itemList);
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);     //사고 남은 금액
		}
	}
	
	
	class Product{
		int price;
		
		Product(int price){
			this.price = price;
	}
}

	
	class Tv extends Product{
		Tv() { super(100); }
		
		public String toString() { return "Tv"; }
	}
	
	
	class Computer extends Product{
		Computer() { super(200); }
		
		public String toString() { return "Computer"; }
	}
	
	
	class Audio extends Product{
		Audio() { super(50); }
		public String toString() { return "Audio"; }
	}