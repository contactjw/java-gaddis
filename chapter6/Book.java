package chapter6;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private int copiesSold;
	
	public Book(String t, String a, String p, int c) {
		title = t;
		author = a;
		publisher = p;
		copiesSold = c;
	}
	
	public void setTitle(String t) {
		title = t;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public void setPublisher(String p) {
		publisher = p;
	}
	
	public void setCopiesSold(int c) {
		copiesSold = c;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public int getCopiesSold() {
		return copiesSold;
	}
}
