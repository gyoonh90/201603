package domain;
/**
 * 책 정보 모델 클래스
 * @author gyun
 *
 */
public class Book {
	private long id;
	private String name;
	private String author;
	private String memo;
	
	public Book(long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
