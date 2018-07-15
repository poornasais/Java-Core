import java.util.Comparator;

public class BookDetails  {

    private String Bookname;
    private String BookAuthor;

    public BookDetails(String bname, String aname){
        this.Bookname = bname;
        this.BookAuthor = aname;
    }

    public int hashCode(){
        int hashcode = 0;
        hashcode = Bookname.length()*20;
        hashcode += BookAuthor.hashCode();
        return hashcode;
    }

    public boolean equals(Object obj){
        if (obj instanceof BookDetails) {
            BookDetails bb = (BookDetails) obj;
            return (bb.BookAuthor.equals(this.BookAuthor) && bb.Bookname == this.Bookname);
        } else {
            return false;
        }
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public String toString(){
        return "Book Name: " +getBookname()+ "  Book Author: " +getBookAuthor()+ "\n";
    }
}
