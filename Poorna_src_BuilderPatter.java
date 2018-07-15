public class BuilderPatter {


    private  String bookName;
    private  String Author;
    private  int ISBNNumber;
    private String[] bookstores;

    public BuilderPatter setBookName(String name){
        this.bookName = name;
        return this;
    }

    public BuilderPatter setAuthor(String name){
        this.Author = name;
        return  this;
    }

    public BuilderPatter setISBN(int num){
        this.ISBNNumber = num;
        return this;
    }

    public BuilderPatter setbookstore(String[] store){
        this.bookstores = store;
        return this;
    }

    public Book getBook(){
        return new Book(bookName, Author, ISBNNumber, bookstores);
    }


}
