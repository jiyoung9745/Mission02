import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {

    private BookManage bookManager;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    @BeforeEach
    public void setUp() {
        bookManager = new BookManage();
        book1 = new Book(1, "자바 기초", "Jane", 2021);
        book2 = new Book(2, "소프트웨어 공학", "Tom", 2014);
        book3 = new Book(3, "분산 컴퓨팅", "Yoon", 2024);
        book4 = new Book(4, "컴퓨터 네트워크", "Han", 2021);
        book5 = new Book(5, "알고리즘", "Kim", 2020);
        book6 = new Book(6, "데이터베이스", "Sam", 2010);
        


    }

    @Test
    public void testAddBook() {
        
        System.out.println(bookManager.addBook(book1));
        System.out.println(bookManager.addBook(book1));
      
    }

    @Test
    public void testSearchBook() {
    	 System.out.println(bookManager.addBook(book4));
        System.out.println(bookManager.searchBook(4));

    }

    @Test
    public void testRemoveBook() {
    	System.out.println(bookManager.addBook(book2));
    	System.out.println(bookManager.removeBook(2));
        System.out.println(bookManager.removeBook(5));
    }
    
    @Test
    public void testSearch_bs() {
    	System.out.println(bookManager.addBook(book1));
    	System.out.println(bookManager.addBook(book2));
    	
    	System.out.println(bookManager.search_bs(2));
    	System.out.println(bookManager.search_bs(1));
    	System.out.println(bookManager.search_bs(3));
    	
	
    }
    
    @Test
    public void testPerformance() {
    	System.out.println(bookManager.addBook(book5));
    	System.out.println(bookManager.addBook(book6));
    	
    	 long start = System.nanoTime();

         System.out.println(bookManager.searchBook(5));
         System.out.println(bookManager.searchBook(6));

         long end = System.nanoTime();

         System.out.println("Execution Time for searchBook : " + (end - start) + " ns");
         
         start = System.nanoTime();

         System.out.println(bookManager.search_bs(5));
         System.out.println(bookManager.search_bs(6));

         end = System.nanoTime();

         System.out.println("Execution Time for search_bs: " +(end - start) + " ns");
    	
    }

}
