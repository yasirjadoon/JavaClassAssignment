package assingment;

import java.util.Random;
import java.util.Scanner;

public class Assingment {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        int number;
        char chance;
        int storeRandom;
        int freeTrail = 3;
        boolean bool = true;
        int loss = 3;
        int cradit = 1;

        do {
            bool = false;
            System.out.print("Do you want to play game press Y/y : ");
            chance = userInput.next().charAt(0);

            if (chance == 'y' || chance == 'y') {
                storeRandom = (random.nextInt(10) + 1);
                System.out.println("Random is " + storeRandom);
                System.out.print("Enter a number : ");
                number = userInput.nextInt();

                if (number == storeRandom) {
                    System.out.println("random is match you won ");
                    bool = true;
                    freeTrail--;
                    if (freeTrail == 0) {
                        System.out.println("you free trial is end! Press 1 to get credit");
                        number = userInput.nextInt();
                        if (number >= 1 && number <= 10) {
                            bool = true;
                            cradit++;
                        }
                        System.out.println("total cradit "+ cradit);
                    }
                } else {
                    System.out.println("random is not match ");
                    bool = true;
                    loss--;
                    System.out.println("You have " + loss + " chance left ");
                    if (loss == 0) {
                        System.out.println("you have no change to paly game ");
                        break;
                    }
                }

            } else {
                System.out.println("invalid input");
            }
        } while (bool);

    }

}
