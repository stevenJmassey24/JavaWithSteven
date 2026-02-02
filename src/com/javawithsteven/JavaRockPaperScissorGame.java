package com.javawithsteven;

import java.util.Random;
import java.util.Scanner;

public class JavaRockPaperScissorGame {
    public static void main(String[] arg) {
        System.out.println("Let's play Rock, Paper and Scissors :");

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String restart;

        do {
            String Userchoice;

            while(true){
                System.out.println("Add your choice Rock, paper and Scissors :");
                Userchoice = scan.nextLine().toLowerCase();

                if(
                        Userchoice.equals("rock")||
                        Userchoice.equals("paper")||
                        Userchoice.equals("scissors")
                ){
                    System.out.println("User has chose : " + Userchoice);
                    break;
                }else {
                    System.out.println("Invalid Input.");
                }
            }

            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice is : " + computerChoice);

            if (Userchoice.equals(computerChoice)) {
                System.out.println("Match is draw.");
            } else if (
                    Userchoice.equals("rock") && computerChoice.equals("scissors") ||
                            Userchoice.equals("paper") && computerChoice.equals("rock") ||
                            Userchoice.equals("scissors") && computerChoice.equals("paper")
            ) {
                System.out.println("User wins.");
            } else {
                System.out.println("Computer Wins.");
            }
            System.out.println("Play Again? Yes/No");
            restart = scan.nextLine().toLowerCase();
        } while (restart.equals("yes"));

        scan.close();
    }
}
