package controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import domain.Book;
/**
 * 
 * Book관련 Controller
 * @author gyun
 *
 */
@RestController
public class BookController {
	
	private static final String template = "당신이 고른 책은, %s출판사의 %s!";
	private final AtomicLong counter = new AtomicLong();

	/**
	 * 
	 * DB 부분을 대신함 생성자 부분
	 * @author gyun
	 *
	 */
	private Map<Long,Book> books = new ConcurrentHashMap<>();
	public BookController() {
		books.put(0l, new Book(0, "엄마를 부탁해", "키움"));
		books.put(1l, new Book(1, "나는 아직 어른이 되려면 멀엇다", "키움"));
		books.put(2l, new Book(2, "해리포터", "키움"));
		books.put(3l, new Book(3, "시, 밤", "키움"));
	}
	
	/**
	 * 
	 * (get방식 일 경우) 모든 책을 출력해준다
	 * @author gyun
	 *
	 */
    @RequestMapping(value = "/book/booklist")
    public  Map<Long,Book> allBook() {
    	System.out.println(this.getClass() + ".allBook() \n 모든책을 출력합니다");
    	return books;
    }
    
	/**
	 * 
	 * (POST 방식 일 경우 )책의 정보를 주면 책을 추가한다
	 * @author gyun
	 *
	 */
    @RequestMapping(value = "/book/addBook", method = RequestMethod.POST)
    public Book addBook(@RequestParam(value="name", defaultValue="World") String name) {
    	System.out.println(this.getClass() + ".addBook() \n 책을 더합니다. ");
    	Book book = new Book(books.size(),"","");
    	books.put((long)books.size(), book);
    	return book;
    }
    
	/**
	 * 
	 * (GET 방식 일 경우 ) 책 순번으로 책을 검색한다
	 * @author gyun
	 *
	 */
    @RequestMapping("/book/{id}")
    public Book searchBookById(@PathVariable long id ,@RequestParam(value="name", defaultValue="World") String name) {
    	System.out.println(this.getClass() + ".searchBookById() \n 책 순번으로 책을 검색합니다. ");
    	return books.get(id);
    }
}
