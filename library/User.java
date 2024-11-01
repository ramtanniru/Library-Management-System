package library;
public class User{
    private int id;
    private int booksBorrowed;
    private String name;
    private String type;
    public User(int id,String name,String type){
        this.id = id;
        this.name = name;
        this.type = type;
        this.booksBorrowed = 0;
    }
    
    public String getName() {return name;}
    
    public boolean canBorrow(){
        if(type.equals("student") && booksBorrowed<3) return true;
        if(type.equals("faculty") && booksBorrowed<5) return true;
        return false;
    }
    public void borrowBook(String title){
        if(canBorrow()) booksBorrowed++;
    }
    public void returnBook(String title){
        if(booksBorrowed>0) booksBorrowed--;
    }
    
}