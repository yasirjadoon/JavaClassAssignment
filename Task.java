/**
* Task.java
* 
* Yasir Khan Jadoon 
* Yasirjadoon313@gmail.com    
* 
* This is the class assignment of java to create a simple game
*/

import java.util.Scanner;

public class Task {
    public static void main (String args[]) {
       
        // initilize variables 
        boolean flag = true;
        int count = 3;
        
        // taking input form user
        Scanner userInput = new Scanner(System.in);
        
        do {
            
            // by default flag will be false
            flag = false;
            
            // prompt to user for input 
            System.out.print("Enter a number : ");
            int number = userInput.nextInt();
        
            if (number >= 0 && number <= 10 ) {
                
                System.out.printf("You Win \n");
            
             } else {
                
                System.out.printf("You loss \n");
            
                if (number > 10 ) {
                
                        System.out.printf("Do you want to play again press y/Y  \n");
                        char chance = userInput.next().charAt(0);
                
                    if (chance == 'y' || chance == 'Y') {
                        
                        // start again 
                        flag = true;
                        count --;
                        System.out.printf("You have %d\n",count);
                   
                        if (count == 0) {
                                System.out.printf("Sorry no chance \n");    
                                flag = false;
                   }
                   
               }
            }
        }
        }while(flag);
        
        
    }
}