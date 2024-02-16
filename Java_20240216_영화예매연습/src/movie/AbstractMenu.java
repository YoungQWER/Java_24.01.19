package movie;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter

public abstract class AbstractMenu implements Menu{    //추상 클래스
	
	protected String menuText;   //기본 문구
	protected Menu prevMenu;     //이전 메뉴

	
}
