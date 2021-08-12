package com.bridgelabz;

import com.bridgelabz.com.bridgelabz.Utility.Utility;

import java.lang.reflect.Array;

public class SnakeLadder<board, START, END> {
    public static void main(String[] args) {

        Utility utility= new Utility();

    int[] board =new int[100];
    int START=0;
    int END;
        END = board.length;
        int i;
    System.out.println("Welcome to Snake and Laddder game");
    System.out.println("----------------------------------");

    System.out.println("START POSITION:"+START);
    System.out.println("END POSITION:"+END);
    System.out.println("----------------------------------");

        /**
         * DICE ROLL
         */
        int roll;
        roll=utility.diceRoll();
        System.out.println("DICE ROLL:"+roll);


    }

}
