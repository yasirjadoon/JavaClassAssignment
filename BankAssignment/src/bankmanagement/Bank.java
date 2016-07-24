
import java.util.Scanner;

public class Bank {

Customer customers = new Customer();
Scanner userInput = new Scanner(System.in);
private double blance;
private String name;
    private String accountNumber;
    private double withDraw;

    public void addCustomer() {
        System.out.print("Account holder name : ");
        name = userInput.nextLine();
        customers.setName(name);

        System.out.print("Account Number : ");
        customers.setAccountNumber(userInput.next());
    }

    public void deposit() {
        // addCustomer();
        System.out.print("Add amount : ");
        amount = userInput.nextDouble();
        customers.display();
    }

    public void withdraw() {
        System.out.print("Enter amount : ");
        myInput= userInput.nextDouble();

        System.out.println("before with draw " + amount);
        double newamount= (amount - withDraw);

        if (amount > withDraw) {
            System.out.println("Thank you,");

        } else {
            System.out.println("Sorry! ");
        }

    }

}
