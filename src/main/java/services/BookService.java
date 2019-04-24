package services;


import annotations.numbers.NumberCountSpecifier;
import annotations.parity.Even;
import entity.Digits;
import generators.Number;
import entity.Book;
import javax.inject.Inject;
import java.util.Date;
import java.util.logging.Logger;

public class BookService {

    @Inject
    Logger log;

    @Inject
    private Date date;

    @Inject
//    @Eight
//    @FullNumberDescriber(value = Digits.EIGHT, even =  true)
//    @Odd @NumberCountSpecifier(Digits.EIGHT)
//    @Thirteen
    @Even
    @NumberCountSpecifier(value = Digits.THIRTEEN)
    private Number number;

    public Book createBook(String title, Double price, String description) {
        log.info("before book creating");
        Book book = new Book(title, description, price, date);
        book.setIsn(number.generate());
        return book;
    }
}
