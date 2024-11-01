package library;
import java.util.*;
public class Library{
    Map<String,Book> store;
    Map<Integer,User> users;
    public Library(){
        this.store = new HashMap<>();
        this.users = new HashMap<>();
    }
    
    // Book methods
    public void addBook(String title,String author,String genre){
        Book b = new Book(title,author,genre);
        store.put(title,b);
    }
    public void deleteBook(String title){
        store.remove(title);
    }
    public void updateBook(String oldTitle,String title,String author,String genre){
        Book b = new Book(title,author,genre);
        store.replace(oldTitle,b);
    }
    
    // User methods
    public void addUser(int id,String name,String type){
        User u = new User(id,name,type);
        users.put(id,u);
    }
    public void removeUser(int id){
        users.remove(id);
    }
    public void borrowBook(int id,String title){
        User user = users.get(id);
        Book book = store.get(title);
        if(user!=null && book!=null && book.isAvailable() && user.canBorrow()){
            user.borrowBook(title);
            book.setAvailability(false);
            System.out.println(user.getName()+" successfully borrowed "+title+" book");
        }
        else{
            System.out.println(user.getName()+" cannot borrow "+title+" book");
        }
    }
    public void returnBook(int id,String title){
        User user = users.get(id);
        Book book = store.get(title);
        if(user!=null && book!=null && !book.isAvailable()){
            user.returnBook(title);
            book.setAvailability(true);
            System.out.println(user.getName()+" successfully returned "+title+" book");
        }
        else{
            System.out.println(user.getName()+" cannot return "+title+" book");
        }
    }
    
}