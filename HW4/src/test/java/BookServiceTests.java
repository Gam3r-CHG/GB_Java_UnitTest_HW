import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookServiceTests {
  private BookService bookService;
  private BookRepository bookRepository;

  /*У вас есть класс BookService, который использует интерфейс BookRepository для получения
  информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
  используя Mockito для создания мок-объекта BookRepository.*/

  @BeforeEach
  public void setUp() {
    bookRepository = getMockBookRepository();
    bookService = new BookService(bookRepository);
  }

  @Test
  public void findBookTest() {
    var id = "1";
    var book = bookService.findBookById(id);
    assertEquals(id, book.getId());
    assertEquals("Book1", book.getTitle());
    assertEquals("Author1", book.getAuthor());
    verify(bookRepository, times(1)).findById(id);
  }

  @Test
  public void notFoundBookTest() {
    var id = "0";
    var book = bookService.findBookById(id);
    assertEquals(null, book);
    verify(bookRepository, times(1)).findById(id);
  }

  @Test
  public void findAllBooksTest() {
    var testBooks = getTestBooks();
    var books = bookService.findAllBooks();
    assertEquals(testBooks, books);
    verify(bookRepository, times(1)).findAll();
  }

  private BookRepository getMockBookRepository() {
    ArrayList<Book> books = getTestBooks();

    BookRepository bookRepositoryMock = mock(BookRepository.class);

    when(bookRepositoryMock.findAll()).thenReturn(books);
    when(bookRepositoryMock.findById(anyString()))
        .thenAnswer(
            invocationOnMock -> books.stream()
                .filter(book -> book.getId() == invocationOnMock.getArgument(0))
                .findFirst().orElse(null)
        );

    return bookRepositoryMock;
  }

  private ArrayList<Book> getTestBooks() {
    ArrayList<Book> books = new ArrayList<>();
    Book book1 = new Book("1", "Book1", "Author1");
    Book book2 = new Book("2", "Book2", "Author2");
    Book book3 = new Book("3", "Book3", "Author3");
    Book book4 = new Book("4", "Book4", "Author4");
    Book book5 = new Book("5", "Book5", "Author5");
    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.add(book4);
    books.add(book5);
    return books;
  }
}
