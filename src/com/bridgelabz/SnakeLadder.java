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

    int START=0;
    int positionPlayer=1;
    int rollTimes=0;
    int END;
        END = board.length;
        int i;
    System.out.println("Welcome to Snake and Laddder game");
    System.out.println("----------------------------------");

    System.out.println("START POSITION:"+START);
    System.out.println("END POSITION:"+END);
    System.out.println("----------------------------------");

                for(positionPlayer=1;positionPlayer<=100;positionPlayer++) {
                    int roll;

                    roll = utility.diceRoll();
                    System.out.println("DICE ROLL:" + roll);
                    rollTimes++;
                    positionPlayer = positionPlayer + roll;
                    /**
                     * CHECK OPTION FROM 1).NO MOVE 2).LADDER 3).SNAKE
                     */
                    positionPlayer = utility.getPosition(positionPlayer, roll, snakesLaddersArray);
                    System.out.println("Position of player:"+positionPlayer);
                    System.out.println("Times Dice Rolled:"+rollTimes);
                    System.out.println("--------------------------------------------------------");

                }

            }
        }








