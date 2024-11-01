package library;
public class Book{
    private String title;
    private String author;
    private String genre;
    private boolean availability;
    public Book(String t,String a,String g){
        this.title = t;
        this.author = a;
        this.genre = g;
        this.availability = true;
    }
    
    public boolean isAvailable() {return availability;}
    public void setAvailability(boolean a) {this.availability = a;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getGenre() {return genre;}
}