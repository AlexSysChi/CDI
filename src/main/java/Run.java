import entity.Book;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import services.BookService;

public class Run {
    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();

        BookService bookService = weldContainer
                .instance()
                .select(BookService.class)
                .get();
        Book book = bookService.createBook("Book one", 5., "first attempt");

        System.out.println(book);


    }
}
