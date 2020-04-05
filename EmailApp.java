package EmailAdmin;
import java.util.Scanner;
public class EmailApp {
public static void main(String[] args) {
	
	Email test = new Email("FirstName", "LastName");
	System.out.println(test.showInfo());
	
}
}
