public class Book {
    private Author author;
    private String bookName;
    private Integer dateOfPublic;

    public Book(Author author, String bookName, Integer dateOfPublic) {
        this.author = author;
        this.bookName = bookName;
        this.dateOfPublic = dateOfPublic;
    }

    public Author getAuthor(Author author) {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getDateOfPublic() {
        return dateOfPublic;
    }

    public void setDateOfPublic(Integer dateOfPublic) {
        this.dateOfPublic = dateOfPublic;
    }
}
