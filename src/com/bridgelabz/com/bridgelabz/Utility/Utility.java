package com.bridgelabz.com.bridgelabz.Utility;

public class Utility {


    public static int diceRoll() {
        int faceValue;
        faceValue = (int) Math.floor((Math.random() * 10 % 6) + 1);
        return faceValue;
    }


    /**
     *
     */
        public static int getPosition (int userPosition, int userRoll, int snakesLaddersArray [])
    {
        if(userPosition == snakesLaddersArray[0]) //if position equals snake 1
        {
            userPosition = 19; // set new position
            System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
        }
        else if (userPosition == snakesLaddersArray[1]) //if position equals snake 2
        {
            userPosition = 48; // set new position
            System.out.println ("You Got Bit By A Snake, GO DOWN!!!");

        }
        else if (userPosition == snakesLaddersArray[2]) //if position equals snake 3
        {
            userPosition = 77; // set new position
            System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
        }
        else if (userPosition == snakesLaddersArray[3]) //if position equals ladder 1
        {
            userPosition = 34; // set new position
            System.out.println ("You Got A Ladder!! GO UP!!!");

        }
        else if (userPosition == snakesLaddersArray[4]) //if position equals ladder 2
        {
            userPosition = 64; // set new position
            System.out.println ("You Got A Ladder!! GO UP!!!");

        }
        else if (userPosition == snakesLaddersArray[5]) //if position equals ladder 3
        {
            userPosition = 86; // set new position
            System.out.println ("You Got A Ladder!! GO UP!!!");
        }


        else if (userPosition > 100) // checks if user's location if greater then a 100
        {
            userPosition = userPosition - userRoll; // subtract userRoll from the userposition to get back old position
            System.out.println ("OHHH You cant jump, you must land on a 100"); // print out the users current location

        }
        else if (userPosition == 100)
        {
            System.out.println ("YOU WON, GOOD JOB!!!"); // print out that the user won

        }

        return userPosition; // return the final position : this position had gone through all checks and test and can be displayed on screen
    }// end getP


    /**
     * To check who wins in less roll times
     */
    public static void checkWinner( int num1,int num2){
        if(num1==num2){
            System.out.println("Its a Tie ");
        }
        else if (num1>num2){
            System.out.println("PLAYER 2 WINS WITH FEWER DICE ROLLS ");
        }
        else if (num1<num2){
            System.out.println("PLAYER 1 WINS WITH FEWER DICE ROLLS");
        }
    }

        }


