package com.training.paradise;

import java.util.Scanner;

public class Launcher {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int navigation;
        do {
            System.out.println("Welcolcome aboard ! \n");
            System.out.println("What would you like to do ?");
            System.out.println("1 - Add a place");
            System.out.println("2 - Find a place");
            System.out.println("3 - Edit a place");
            System.out.println("4 - Remove a place");
            System.out.println("5 - Add a trip");
            System.out.println("6 - Find a trip");
            System.out.println("7 - Remove a trip");
            System.out.println("8 - Quit");
            navigation = scanner.nextInt();
            switch (navigation) {
                case 1:
                    //Instruction
                    break;
                case 2:
                    //Instruction
                    break;
                case 3:
                    //Instruction
                    break;
                case 4:
                    //Instruction
                    break;
                case 5:
                    //Instruction
                    break;
                case 6:
                    //Instruction
                    break;
                case 7:
                    //Instruction
                    break;
                case 8:
                    //Instruction
                    break;
            }
        }while(navigation!=8);
    }

}