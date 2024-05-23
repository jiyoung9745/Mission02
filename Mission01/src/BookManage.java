import java.util.ArrayList;
import java.util.List;

class BookManage {
    private List<Book> bookshelf;
    //

    public BookManage() {
        bookshelf = new ArrayList<>();
    }

    public String addBook(Book book) {
        for (Book b : bookshelf) {
            if (b.getId() == book.getId()) {
                return "해당 ID(" + book.getId() + ") 는 이미 존재합니다.";
            }
        }
        bookshelf.add(book);
        return "Book{id: '" + book.getId() + "', 제목: '" + book.getTitle() + "', 저자: '" + book.getAuthor() + "', 출판년도: " + book.getYear() + "} 도서가 추가되었습니다.";
    }

    public String searchBook(int id) {
        for (Book b : bookshelf) {
            if (b.getId() == id) {
                return "검색결과:\n" + "Book{id: '" + b.getId() + "', 제목: '" + b.getTitle() + "', 저자: '" + b.getAuthor() + "', 출판년도: " + b.getYear() + "}";
            }
        }
        return "검색된 도서가 없습니다.";
    }

    public String removeBook(int id) {
        for (Book b : bookshelf) {
            if (b.getId() == id) {
                bookshelf.remove(b);
                return "Book{id: '" + b.getId() + "', 제목: '" + b.getTitle() + "', 저자: '" + b.getAuthor() + "', 출판년도: " + b.getYear() + "} 도서를 삭제했습니다.";
             }
        }
        return "해당 ID(" + id + ")의 도서를 찾을 수 없습니다.";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
