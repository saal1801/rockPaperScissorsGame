package com.rock.paper.scissor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String myMove;
        int rand;
        String opponentMove;


        Scanner scanner = new Scanner(System.in);

        //Loop through and asking the user to enter a move
        while (true){

            System.out.println("Enter your move. Type in rock, paper or scissors. " +
                    "If you want to exit the game, typ in quit ");

            myMove = scanner.nextLine();

            //Check if the user entered quit
            if (myMove.equalsIgnoreCase("quit")){
                break;
            }

            //Verify that myMove is valid
            if ((!myMove.equalsIgnoreCase("rock")) &&
                    (!myMove.equalsIgnoreCase("paper")) &&
                    (!myMove.equalsIgnoreCase("scissors"))){
                System.out.println("Your move isn't valid!");
            }else {
                //Randomly generate the opponents move (0, 1, 2)
                rand = (int)(Math.random()*3);

                if (rand == 0){
                    opponentMove = "Rock";
                }else if (rand == 1){
                    opponentMove = "paper";
                }else {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent move: " + opponentMove);

                //Calculate who won or not
                if (myMove.equals(opponentMove)){
                    System.out.println("You tied");

                }else if((myMove.equalsIgnoreCase("rock") && opponentMove.equalsIgnoreCase("scissors")) ||
                        (myMove.equalsIgnoreCase("scissors") && opponentMove.equalsIgnoreCase("paper")) ||
                        (myMove.equalsIgnoreCase("paper") && opponentMove.equalsIgnoreCase("rock"))) {

                    System.out.println("You won!");
                }else {
                    System.out.println("You lost!");

                }
            }
        }

        System.out.println("Thanks for playing and see you later");
    }
}

