package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class drinkOrder {

    static Scanner in = new Scanner(System.in);

    public drinkOrder() {
    }


    public ArrayList<drinkOrder> drinkOrders() {

        //checkout checkoutObject = new checkout();

        double total = 0;


        double[] drinkPrice = new double[3];
        drinkPrice[0] = 2.00;
        drinkPrice[1] = 2.50;
        drinkPrice[2] = 3.00;


        //Size Array
        String[] drinkSiz = new String[3];
        drinkSiz[0] = "Small";
        drinkSiz[1] = "Medium";
        drinkSiz[2] = "Large";

        System.out.println("Choose a size:\n"
                + "[0] " + drinkSiz[0] + " " + drinkPrice[0] + " \n"
                + "[1] " + drinkSiz[1] + " " + drinkPrice[1] + " \n"
                + "[2] " + drinkSiz[2] + " " + drinkPrice[2] + " \n");
        int choice = in.nextInt();
        System.out.println("Please enter a number to select size");

        total += in.nextInt();
        System.out.println("Drink size price is: " + total);

//checkoutObject.receipt();
    return null;
    }


    }



