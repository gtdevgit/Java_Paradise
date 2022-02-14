package com.training.paradise;

import com.training.paradise.dao.DaoFactory;
import com.training.paradise.model.Place;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class launcher {

    static Scanner scanner = new Scanner(System.in);

    private static final int MENU_ADD_PLACE = 1;
    private static final int MENU_LIST_PLACE = 2;

    public static void main(String[] args) {
        int navigation;
        do {
            System.out.println("Welcome aboard ! \n");
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
                case MENU_ADD_PLACE:
                    //Instruction
                    addPlace();
                    break;
                case MENU_LIST_PLACE:
                    //Instruction
                    listPlace();
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
                default:
                    break;
            }
        }while(navigation!=8);
    }

    private static void addPlace(){
        System.out.println("Enter place name : ");
        String name = scanner.next();
        Place place = new Place( name);
        Long id = DaoFactory.getPlaceDao().create(place);
        System.out.println("new id = " + id);
    }

    private static void listPlace() {
        List<Place> places = DaoFactory.getPlaceDao().findAll();
        for (Place place : places){
            System.out.println("id : " + place.getId() + ",  name : " + place.getName());
        }
    }
}


