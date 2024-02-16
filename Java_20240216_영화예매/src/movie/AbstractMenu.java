package movie;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter

public abstract class AbstractMenu implements Menu{	 //추상 클래스

	protected String menuText;  //기본 문구
	protected Menu prevMenu;    //이전 메뉴
	
	protected static final Scanner sc = new Scanner(System.in);
	
//	AbstractMenu(String menuText, Menu prevMenu){
//		this.menuText = menuText;
//		this.prevMenu = prevMenu;
//	}                                                  //lombok
	
//	public void setPrevMenu(Menu prevMenu) {
//		this.prevMenu = prevMenu;
//	}                                                  //lombok
	
	@Override
	public void print() {
		System.out.println("\n" + menuText);   //메뉴출력
	}
	
//	@Override
//	public Menu next() {
//		return null;
//	}
}
