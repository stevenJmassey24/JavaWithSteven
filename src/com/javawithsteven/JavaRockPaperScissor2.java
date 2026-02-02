package com.javawithsteven;

import java.util.Random;
import java.util.Scanner;

public class JavaRockPaperScissor2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String restart;

        System.out.println("Let's play Rock, Paper and Scissor :");

        do {
            String userChoice = getUserInput(scan);
            String computerChoice = getComputerChoice(random);
            System.out.println("Computer choice is : " + computerChoice);

            String result = decideWinner(userChoice,computerChoice);
            System.out.println(result);

            restart = askRestart(scan);
        }while (restart.equals("yes"));

        scan.close();
        System.out.println("Game Over.");
    }

    //Method to get User Input :
    public static String getUserInput(Scanner scan){
        String choice;

        while(true){
            System.out.println("Enter your choice Rock, Paper or Scissors :");
            choice = scan.nextLine().toLowerCase();

            if (
                    choice.equals("rock") ||
                    choice.equals("paper") ||
                    choice.equals("scissors")
            ){
                return choice;
            }else {
                System.out.println("Invalid Input.");
            }
        }
    }

        //Method to get the computer choice
        public static String getComputerChoice(Random random){
            String[] choices = {"rock", "paper", "scissors"};
            return choices[random.nextInt(3)];
        }

        //Method to decide the winner
        public static String decideWinner(String user, String computer){
            if(user.equals(computer)){
                return "Match is draw.";
            } else if (
                    user.equals("rock") && computer.equals("scissors") ||
                    user.equals("paper") && computer.equals("rock") ||
                    user.equals("scissors") && computer.equals("paper")
            ) {
                return "User Wins.";
            }else {
                return "Computer Wins.";
            }
        }

        //method to ask for restarting the game
        public static String askRestart(Scanner scan){
        String restart;

        while(true){
            System.out.println("Play again? Yes/No");
            restart = scan.nextLine().toLowerCase();

            if (restart.equals("yes")||restart.equals("no")){
                return restart;
            }
            else {
                System.out.println("Invalid input. Please type Yes or No.");
            }
        }
    }
}


