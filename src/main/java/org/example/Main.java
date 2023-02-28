package org.example;

public class Main {
    //rock paper scissors
    public static void main(String[] args) {
        //game
        while (true) {
            System.out.println("Enter rock, paper or scissors");
            String input = new java.util.Scanner(System.in).nextLine();
            if (input.equals("rock") || input.equals("paper") || input.equals("scissors")) {
                System.out.println("You chose " + input);
                String computer = getComputerChoice();
                System.out.println("Computer chose " + computer);
                if (input.equals(computer)) {
                    System.out.println("It's a tie!");
                } else if (input.equals("rock")) {
                    if (computer.equals("scissors")) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("You lose!");
                    }
                } else if (input.equals("paper")) {
                    if (computer.equals("rock")) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("You lose!");
                    }
                } else if (input.equals("scissors")) {
                    if (computer.equals("paper")) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("You lose!");
                    }
                }
            }
            //invalid input
            else {
                System.out.println("Invalid input");
            }

            }
        }

    private static String getComputerChoice() {
        int randomNumber = (int) (Math.random() * 3);
        String computerChoice = "";
        switch (randomNumber) {
            case 0:
                computerChoice = "rock";
                break;
            case 1:
                computerChoice = "paper";
                break;
            case 2:
                computerChoice = "scissors";
                break;
        }
        return computerChoice;
    }
}
