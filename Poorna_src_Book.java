import java.util.Arrays;

public final class Book {

    private final String bookName;
    private final String Author;
    private final int ISBNNumber;
    private final String[] bookstores;

    public Book(String book, String author, int number, String[] stores){

        this.bookName = book;
        this.Author = author;
        this.ISBNNumber = number;
        this.bookstores = stores;
    }

    public String toString(){
        return "Book Name: " +this.bookName+ "\n Author: " +this.Author+ "\n ISBN Number: "+this.ISBNNumber
                + "\n bookstores: " +Arrays.toString(bookstores);
    }

}
