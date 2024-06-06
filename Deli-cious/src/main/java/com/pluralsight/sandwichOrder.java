package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class sandwichOrder {

    static Scanner in = new Scanner(System.in);

    public sandwichOrder() {
    }


    public void sandwichOrders() {
        ArrayList<sandwichOrder> sandwichOr = new ArrayList<>();

        // bread selection
        System.out.println("Choose from our bread options!");
        int select;
        System.out.println("1 - White Bread");
        System.out.println("2 - Wheat Bread");
        System.out.println("3 - Rye Bread");
        System.out.println("4 - Wrap");


        System.out.println("Enter one of the numbers above!");

        select = in.nextInt();

        while (select != 7) {
            switch (select) {
                case 1:
                    System.out.println("White Bread");
                    break;
                case 2:
                    System.out.println("Wheat Bread");
                    break;
                case 3:
                    System.out.println("Rye Bread");
                    break;
                case 4:
                    System.out.println("Wrap");

                case 5:

                    System.out.println("Choose from our bread options!");
                    System.out.println("1 - White Bread");
                    System.out.println("2 - Wheat Bread");
                    System.out.println("3 - Rye Bread");
                    System.out.println("4 - Wrap");

                    select = in.nextInt();
                    break;
                case 6:

                    break;






            }
            sandwichSize sandwichSizeObject = new sandwichSize();
            sandwichSizeObject.sandwichSizes();

        }

    }

}