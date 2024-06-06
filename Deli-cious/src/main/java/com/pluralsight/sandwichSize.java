package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class sandwichSize {
    static Scanner in = new Scanner(System.in);

    public void sandwichSizes() {

        double total = 0;




      double [] sandwichPrice = new double[3];
        sandwichPrice[0] = 5.50;
        sandwichPrice[1] = 7.00;
        sandwichPrice[2] = 8.50;


      //Size Array
      String [] sandwichSiz = new String[3];
              sandwichSiz[0] = "Small";
              sandwichSiz[1] = "Medium";
              sandwichSiz[2] = "Large";

        System.out.println("Choose a size:\n"
                + "[0] " + sandwichSiz[0] + " " + sandwichPrice[0] + " \n"
                + "[1] " + sandwichSiz[1] + " " + sandwichPrice[1] + "\n "
                + "[2] " + sandwichSiz[2] + " " + sandwichPrice[2]);
        int choice = in.nextInt();
        System.out.println("Please enter a number to select size");

       total += in.nextInt();
       System.out.println( "Price for sandwich is "+ total);

        toppingTypes toppingTypesObject = new toppingTypes();
        toppingTypesObject.toppingMeat();

    }



}
