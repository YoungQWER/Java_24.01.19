package movie;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Moive {

	private long id;	//영화 고유 번호
	private	String title;	//영화 제목
	private	String genre;	//영화 장르
	
	private static final File file = new File("src/movie/movies.txt");
	
}
