package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

import static com.pluralsight.Delicious.orderSelection;

public class chipsOrder  {

    static Scanner in = new Scanner(System.in);

    public chipsOrder() {
    }


    public ArrayList<chipsOrder> chipsOrders() {
        double total = 0;

        drinkOrder drinkObject = new drinkOrder();

        double[] chipsPrice = new double[3];
        chipsPrice[0] = 1.50;
        chipsPrice[1] = 1.50;
        chipsPrice[2] = 1.50;


        //Size Array
        String[] chipType = new String[3];
        chipType[0] = "Potato Chips";
        chipType[1] = "Kettle Chips";
        chipType[2] = "Spicy Chips";

        System.out.println("Choose a size:\n"
                + "[0] " + chipType[0] + " " + chipsPrice[0] + " \n"
                + "[1] " + chipType[1] + " " + chipsPrice[1] + " \n"
                + "[2] " + chipType[2] + " " + chipsPrice[2] + " \n");

        int choice = in.nextInt();
        System.out.println("Please choose from our options");

        total += in.nextInt();
        System.out.println(chipType + " is " + total);


        System.out.println("Would you like a drink?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int Yes = in.nextInt();

        if (Yes == 1) {
            drinkObject.drinkOrders();

        } else {
            orderSelection();
        }
        return null;
    }

        }








