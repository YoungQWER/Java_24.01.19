package movie;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter

public abstract class AbstractMenu implements Menu{   //추상클래스

	protected String menuText;  //기본 문구
	protected Menu prevMenu;    //이전 메뉴
	
	protected static final Scanner sc = new Scanner(System.in);
	
	
	public void print(){
		System.out.println("\n" + menuText);
	}
	
	
}
