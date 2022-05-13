package com.bridgelabz.SnakeAndLadder;
import java.util.Scanner;
import java.util.Random;
public class ProblemThree {
    public static void main(String[] args) {

            System.out.println("Welcome to Snake Ladder Program");

            Scanner read = new Scanner(System.in);
            int position = 0;
            System.out.println("The position  number is at 0 ");
            Random random = new Random();
            int dice1 = random.nextInt(6) + 1;
            System.out.println("The player rolls dice " + dice1);
        }
    }

