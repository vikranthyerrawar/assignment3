package kb;

import employee1.Employee;
import hb.Book;
import hb.Author;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		   
        Scanner sc= new Scanner(System.in);
        
        Employee e=new Employee("VIKRANTH","YERRAWAR",5,350000);
        System.out.print(e);
        Author a=new Author("Arun", "arunsamala380@gmail.com", "m");
        Book b=new Book("VIKRANTH",5.55,2,a);
        System.out.println();
        System.out.print(b);
        
}
}
		   
        