import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BookManage {
    private List<Book> bookshelf;
    //

    public BookManage() {
        bookshelf = new ArrayList<>();
    }

    //책을 책 리스트에 저장
    public String addBook(Book book) {
        for (Book b : bookshelf) {
            if (b.getId() == book.getId()) {
                return "해당 ID(" + book.getId() + ") 는 이미 존재합니다.";
            }
        }
        bookshelf.add(book);
        return "Book{id: '" + book.getId() + "', 제목: '" + book.getTitle() + "', 저자: '" + book.getAuthor() + "', 출판년도: " + book.getYear() + "} 도서가 추가되었습니다.";
    }

    //해당 아이디의 책을 검색(순차)
    public String searchBook(int id) {
        for (Book b : bookshelf) {
            if (b.getId() == id) {
                return "검색결과:\n" + "Book{id: '" + b.getId() + "', 제목: '" + b.getTitle() + "', 저자: '" + b.getAuthor() + "', 출판년도: " + b.getYear() + "}";
            }
        }
        return "검색된 도서가 없습니다.";
    }

    //해당 아이디의 책을 삭제
    public String removeBook(int id) {
        for (Book b : bookshelf) {
            if (b.getId() == id) {
                bookshelf.remove(b);
                return "Book{id: '" + b.getId() + "', 제목: '" + b.getTitle() + "', 저자: '" + b.getAuthor() + "', 출판년도: " + b.getYear() + "} 도서를 삭제했습니다.";
             }
        }
        return "해당 ID(" + id + ")의 도서를 찾을 수 없습니다.";
    }
    // 해당 아이디를 이진탐색해서 책을 검색
    public String search_bs(int id) {
        
        Collections.sort(bookshelf, (b1, b2) -> Integer.compare(b1.getId(), b2.getId()));

        int low = 0;
        int high = bookshelf.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Book midBook = bookshelf.get(mid);

            if (midBook.getId() == id) {
                return "검색결과:\n" + "Book{id: '" + midBook.getId() + "', 제목: '" + midBook.getTitle() + "', 저자: '" + midBook.getAuthor() + "', 출판년도: " + midBook.getYear() + "}";
            } else if (midBook.getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return  "해당 ID(" + id + ")의 도서를 찾을 수 없습니다.";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
