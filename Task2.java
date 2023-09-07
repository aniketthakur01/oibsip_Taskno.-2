import java.util.Scanner;

/**
 * Task2 - NUMBER GUESSING GAME
 */
public class Task2 {

    public static void main(String[] args) {

        int x = 3;
        int key = 0;
        int guessNum = 0;

        int num = 1 + (int) (100 * Math.random());

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to play the GAME, PRESS >> 1  OR  else PRESS >> 2");
            key = scan.nextInt();

            if (key == 1) {
                System.out.println(
                        "Choose a number between 1 to 100" + " You will get three chances to guess the number");
                System.out.println("");

                System.out.println("The Game has started: >>>>");
                for (int i = 1; i <= x; i++) {
                    System.out.println("");
                    System.out.println("Guess the number");

                    guessNum = scan.nextInt();

                    if (num == guessNum) {
                        System.out.println("Good, You have guessed the correct number");
                        System.out.println("Your Score is 30 and " + "Computer Score is 00");
                        break;
                    }

                    else if (num > guessNum) {
                        System.out.println("The guessed number is greater than " + guessNum + ", Try Again!");
                        if (i <= 1) {
                            System.out.println("Remaining Attempts! - 2");
                        } else if (i >= 2) {
                            System.out.println("Remaining Attempts! - 1");
                        }
                    }

                    else if (num < guessNum) {
                        System.out.println("The guessed number is lesser than " + guessNum + ", Try Again!");
                        if (i <= 1) {
                            System.out.println("Remaining Attempts! - 2");
                        } else if (i >= 2) {
                            System.out.println("Remaining Attempts! - 1");
                        }
                    }

                    if (i == x) {
                        System.out.println("");
                        System.out.println("Failed to Guess the correct number");
                        System.out.println("Your attempts are over");
                        System.out.println("The number was " + num);
                        System.out.println("Your Score is 00 and " + "Computer Score is 30");
                        System.out.println("");
                    }
                }
            }

            else if (key == 2) {
                System.out.println("Thankyou For Playing");
                break;
            } 
            else
                System.out.println("please enter a valid choice");
        }
    }

}
