package movie;

public class AdminMenu extends AbstractMenu{

	private static final AdminMenu instance = new AdminMenu(null);
	private static final String ADMIN_MENU_TEXT = //기본 문구
			"1: 영화 예매 하기\n" +
			"2: 영화 목록 보기\n" +
			"3: 영화 삭제 하기\n" +
			"b: 메인 메뉴로 이동\n\n" +
			"메뉴를 선택하세요: ";
	
	private AdminMenu (Menu preMenu) {
		super(ADMIN_MENU_TEXT, preMenu);
	}
	
	public static AdminMenu getInstance() {
		return instance;            //AdminMenu 객체 생성 주소반환( 싱글톤 패턴 )
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case "1" :
			createMovie();      //영화 등록 진행
			return this;
		case "2" :
			printAllMovies();	//영화 목록 출력
			return this;		//adminMenu(관리자) 반환
		case "3" :
			deleteMovie();
			return this;
		case "b" : return prevMenu;		//b 입력하면, 이전 메뉴 반환
		default : return this;			//객체 자기 자신(AdminMenu) ==> new AdminMenu(null);
		}
	}
	
	private void createMovie() {
		System.out.println("제목");
		String title = sc.nextLine();		//제목 입력

		System.out.println("장르");
		String genre = sc.nextLine();		//장르 입력
		
		Movie movie = new Movie(title, genre);
		
			moive.save();
			System.out.println(">> 저장되었습니다.");
	}

	private void printAllMovies() {
	}
	
	private void deleteMovie() {
	}

}
