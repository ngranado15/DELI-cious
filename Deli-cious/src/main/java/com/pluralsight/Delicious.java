package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Delicious {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
homeScreen();
orderSelection();


    }






    public static void homeScreen () {

            System.out.println("Welcome to delicious the sandwich shop!");
            System.out.println("1 - Place a order");
            System.out.println("2 - Exit");
            int order = in.nextInt();

            if (order == 1) {
                orderSelection();
            } else {
                System.out.println("Have a good day, thanks for coming!");
                System.exit(0);
            }

        }


       public static void orderSelection() {

           drinkOrder drinkObject = new drinkOrder();
           chipsOrder chipsObject = new chipsOrder();
          // checkout checkoutObject = new checkout();


            ArrayList<orderScreen> orderSc = new ArrayList<>();

            //order screen
            System.out.println("Order Screen");
            int select;
            System.out.println("1 - Add Sandwich");
            System.out.println("2 - Add Drink");
            System.out.println("3 - Add Chips");
            System.out.println("4 - Checkout");
            System.out.println("5 - Cancel order");
            System.out.println("Enter one of the numbers above!");

            select = in.nextInt();

            while (select != 7) {
                switch (select) {
                    case 1:
                      sandwichSelection(orderSc);
                        break;
                    case 2:
                        drinkObject.drinkOrders();

                    case 3:
                        chipsObject.chipsOrders();
                        break;

                    case 4:
                        //checkoutObject.receipt();

                    case 5:

                        System.out.println("Welcome to the accounting ledger!");
                        System.out.println("1 - Add Sandwich");
                        System.out.println("2 - Add Drink");
                        System.out.println("3 - Add Chips");
                        System.out.println("4 - Checkout");
                        System.out.println("6 - Cancel order");
                        select = in.nextInt();

                    case 6:
                        System.out.println("Have a good day, thanks for coming!");
                        System.exit(0);


                }
            }

        }

public static void sandwichSelection(ArrayList<orderScreen> orderSc){

        sandwichOrder sandwichOrderObject = new sandwichOrder();
        sandwichSize sandwichSizeObject = new sandwichSize();
        Toasted toastedObject = new Toasted();

    ArrayList<sandwichSelection> sandwichSc = new ArrayList<>();

    System.out.println("Build your sandwich!");
    int select;
    System.out.println("1 - Select bread");
    System.out.println("2 - Select Size");
    System.out.println("3 - Toppings");
    System.out.println("4 - Would you like sandwich toasted?");
    System.out.println("5 - Cancel order");
    System.out.println("Enter one of the numbers above!");

    select = in.nextInt();

    while (select != 7) {
        switch (select) {
            case 1:
                sandwichOrderObject.sandwichOrders();
                break;
            case 2:
                sandwichSizeObject.sandwichSizes();

            case 3:
               new toppingTypes();
            case 4:
                toastedObject.toast();
                break;

            case 5:

                System.out.println("Build your sandwich!");
                System.out.println("1 - Select bread");
                System.out.println("2 - Select Size");
                System.out.println("3 - Toppings");
                System.out.println("4 - Would you like sandwich toasted?");
                System.out.println("5 - Cancel order");
                System.out.println("Enter one of the numbers above!");
                select = in.nextInt();

            case 6:
                System.out.println("Have a good day, thanks for coming!");
                System.exit(0);


        }
    }




}




}


