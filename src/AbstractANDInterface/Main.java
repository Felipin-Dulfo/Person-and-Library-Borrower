package AbstractANDInterface;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    Borrower borrower = new Borrower(in.next(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextDouble(), in.nextDouble(), in.next(), in.nextInt());

	    borrower.goToLibraryToBorrowBook();
    }
}
