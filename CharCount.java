import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a String to found character : ");
        String input = userInput.next();

        System.out.print("Enter a character you want to found : ");
        char cFound = userInput.next().charAt(0);

        int come = 0, check;

        for (int i = 0, n = input.length(); i < n; i++) {
            check = input.charAt(i);
            if (check == cFound) {
                come++;
            }
        }
        
        
        System.out.println(cFound + " is appears  "+ come);
    }
}
