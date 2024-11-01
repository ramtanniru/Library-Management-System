import library.Library;
public class Main
{
	public static void main(String[] args) {
		Library l = new Library();
		l.addUser(1,"Ram","student");
		l.addUser(2,"Sai","faculty");
		l.addBook("Java","Leela","Programming");
		l.borrowBook(1,"Java");
		l.borrowBook(2,"Java");
	}
}
