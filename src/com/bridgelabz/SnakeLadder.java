package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.Utility.Utility;

import java.lang.reflect.Array;

public class SnakeLadder<board, START, END> {
    public static void main(String[] args) {

        Utility utility= new Utility();

    int[] board = new int[100];

        // declare all the snakes and ladders in a array
        int snakesLaddersArray [] = new int [6]; // create a 6 element array
        // store the snakes and ladders location in the array
        snakesLaddersArray [0] = 54;    //snake
        snakesLaddersArray [1] = 90;    //snake
        snakesLaddersArray [2] = 92;    //snake
        snakesLaddersArray [3] = 9;     //ladder
        snakesLaddersArray [4] = 40;    //ladder
        snakesLaddersArray [5] = 67;    //ladder
/**
 * Program now for two players
 */
    int START=0;
    int positionPlayer1=1;  //player 1
    int positionPlayer2=1;  //player 2
    int rollTimes1=0;       //player 1 times rolled
    int rollTimes2=0;       //player 2 times rolled
    int END;
        END = board.length;
        int i;
    System.out.println("Welcome to Snake and Laddder game");
    System.out.println("----------------------------------");

    System.out.println("START POSITION:"+START);
    System.out.println("END POSITION:"+END);
    System.out.println("----------------------------------");

    System.out.println("PLAYER 1");
                for(positionPlayer1=1;positionPlayer1<=100;positionPlayer1++) {
                    int roll1;

                    roll1 = utility.diceRoll();
                    System.out.println("DICE ROLL:" + roll1);
                    rollTimes1++;
                    positionPlayer1 = positionPlayer1 + roll1;
                    /**
                     * CHECK OPTION FROM 1).NO MOVE 2).LADDER 3).SNAKE
                     */
                    positionPlayer1 = utility.getPosition(positionPlayer1, roll1, snakesLaddersArray);
                    System.out.println("Position of PLAYER ONE:"+positionPlayer1);
                    System.out.println("Times Dice Rolled by PLAYER ONE:"+rollTimes1);
                    System.out.println("--------------------------------------------------------");

                }
        System.out.println("PLAYER 2");
        for(positionPlayer2=1;positionPlayer2<=100;positionPlayer2++) {
            int roll2;

            roll2 = utility.diceRoll();
            System.out.println("DICE ROLL:" + roll2);
            rollTimes2++;
            positionPlayer2 = positionPlayer2 + roll2;
            /**
             * CHECK OPTION FROM 1).NO MOVE 2).LADDER 3).SNAKE
             */
            positionPlayer2 = utility.getPosition(positionPlayer2, roll2, snakesLaddersArray);
            System.out.println("Position of PLAYER TWO:"+positionPlayer2);
            System.out.println("Times Dice Rolled by PLAYER TWO:"+rollTimes2);
            System.out.println("--------------------------------------------------------");

        }
                utility.checkWinner(rollTimes1,rollTimes2);
            }
        }








