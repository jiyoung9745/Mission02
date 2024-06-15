import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {

    private BookManage bookManager;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    public void setUp() {
        bookManager = new BookManage();
        book1 = new Book(1, "자바 기초", "Jane", 2021);
        book2 = new Book(2, "소프트웨어 공학", "Tom", 2014);
        book3 = new Book(3, "분산 컴퓨팅", "Yoon", 2024);
        


    }

    @Test
    public void testAddBook() {
        
        System.out.println(bookManager.addBook(book1));
        System.out.println(bookManager.addBook(book1));
      
    }

    @Test
    public void testSearchBook() {
    	 System.out.println(bookManager.addBook(book1));
        System.out.println(bookManager.searchBook(1));

    }

    @Test
    public void testRemoveBook() {
    	System.out.println(bookManager.addBook(book2));
    	System.out.println(bookManager.removeBook(2));
        System.out.println(bookManager.removeBook(1));
    }
    
    @Test
    public void testSearch_bs( ) {
    	System.out.println(bookManager.addBook(book1));
    	System.out.println(bookManager.addBook(book2));
    	
    	System.out.println(bookManager.search_bs(2));
    	System.out.println(bookManager.search_bs(1));
    	System.out.println(bookManager.search_bs(3));
    	
	
    }

}
