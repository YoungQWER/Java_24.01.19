package movie;

public class MainMenu extends AbstractMenu{

	private static final MainMenu instance = new MainMenu(null);
	private static final String MAIN_MENU_TEXT =  //기본 문구
			"1: 영화 예매하기\n" +
			"2: 예매 확인하기\n" +
			"3: 예메 취소하기\n" +
			"4: 관리자 메뉴로 이동하기\n" +
			"q: 종료\n\n" +
			"메뉴를 선택하세요: ";
	
	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT, prevMenu);   //부모 생성자 호출
	}
	
	public static MainMenu getInstance() {
		return instance;     //mainMenu 객체 생성 주소반환 ( 싱글톤 패턴 )
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case "4" : 
			if(! checkaAdminPassword()) {
				System.out.println(">> 비밀번호가 틀렸습니다.");
			return this;
			}
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this);
			return adminMenu;
			
		default : return this;
		}
	}

	private boolean checkaAdminPassword() {
		System.out.println("관리자 비밀번호를 입력하세요 : ");
		
		String admin = sc.nextLine();
		return "admin".equals(admin);
	}
	
}
