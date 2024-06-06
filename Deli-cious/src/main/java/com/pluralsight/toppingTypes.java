package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class toppingTypes {
    static Scanner in = new Scanner(System.in);

    public toppingTypes() {

        ArrayList<toppingTypes> toppingSc = new ArrayList<>();

        //order screen
        System.out.println("Choose your toppings");
        int select;
        System.out.println("1 - Add Meat");
        System.out.println("2 - Add Cheese");
        System.out.println("3 - Add Veggies");
        System.out.println("4 - Add Sauces");
        System.out.println("5 - Add Sides");
        System.out.println("8 - Return to previous menu");

        System.out.println("Enter one of the numbers above!");

        select = in.nextInt();

        while (select != 9) {
            switch (select) {
                case 1:
                    toppingMeat();
                    break;
                case 2:
                    toppingCheese();

                case 3:
                    toppingVeggies();
                    break;

                case 4:
                    toppingSauces();
                case 5:
                    toppingSides();
                case 6:
                    new sandwichSelection();

                case 7:

                    System.out.println("1 - Add Meat");
                    System.out.println("2 - Add Cheese");
                    System.out.println("3 - Add Veggies");
                    System.out.println("4 - Add Sauces");
                    System.out.println("5 - Add Sides");
                    System.out.println("6 - Return to previous menu");
                    select = in.nextInt();


            }
        }
    }


    public void toppingMeat() {


        System.out.println("Choose your size to add meat");
        int select;
        System.out.println("1 - Add Meat to small");
        System.out.println("2 - Add Meat to Medium");
        System.out.println("3 - Add Meat to Large");
        System.out.println("5 - Return to previous menu");

        System.out.println("Enter one of the numbers above!");

        select = in.nextInt();

        while (select != 5) {
            switch (select) {
                case 1:
                    meatSmall();
                    break;
                case 2:
                    meatMedium();

                case 3:
                    meatLarge();
                    break;


                case 4:

                    System.out.println("Choose your size to add meat");
                    System.out.println("1 - Add Meat to small");
                    System.out.println("2 - Add Meat to Medium");
                    System.out.println("3 - Add Meat to Large");
                    System.out.println("5 - Return to previous menu");
                    select = in.nextInt();


            }


        }
    }

    public void meatSmall() {

        double total = 0;


        double[] smallMeatPrice = new double[6];
        smallMeatPrice[0] = 1.00;
        smallMeatPrice[1] = 1.00;
        smallMeatPrice[2] = 1.00;
        smallMeatPrice[3] = 1.00;
        smallMeatPrice[4] = 1.00;
        smallMeatPrice[5] = 1.00;


        //Size Array
        String[] smallMeatType = new String[6];
        smallMeatType[0] = "Steak";
        smallMeatType[1] = "Ham";
        smallMeatType[2] = "Salami";
        smallMeatType[3] = "Roast Beef";
        smallMeatType[4] = "Chicken";
        smallMeatType[5] = "Bacon";

        System.out.println("Choose a meat:\n"
                + "[0] "+smallMeatType[0]+" "+ smallMeatPrice[0]+"\n"
                + "[1] "+smallMeatType[1]+ " "+smallMeatPrice[1]+"\n"
                + "[2] "+smallMeatType[2]+" "+ smallMeatPrice[2]+"\n"
                + "[3] "+smallMeatType[3]+" "+smallMeatPrice[3]+"\n"
                + "[4] "+smallMeatType[4]+" "+ smallMeatPrice[4]+"\n"
                + "[5] "+smallMeatType[5]+" "+ smallMeatPrice[5]);


        int choice = in.nextInt();
        System.out.println("Please enter a number to select meat");

        total += in.nextInt();
        System.out.println("Meat price for small size is: " + total);

        int Yes = in.nextInt();

        if (Yes == 1) {
            double extraMeat = total + 0.50;
            System.out.println("Meat price for small size sandwich is: " + extraMeat);
            toppingCheese();

        } else {
            toppingCheese();
        }


    }


    public void meatMedium() {

        double total = 0;


        double[] mediumMeatPrice = new double[6];
        mediumMeatPrice[0] = 2.00;
        mediumMeatPrice[1] = 2.00;
        mediumMeatPrice[2] = 2.00;
        mediumMeatPrice[3] = 2.00;
        mediumMeatPrice[4] = 2.00;
        mediumMeatPrice[5] = 2.00;


        //Size Array
        String[] meatType = new String[6];
        meatType[0] = "Steak";
        meatType[1] = "Ham";
        meatType[2] = "Salami";
        meatType[3] = "Roast Beef";
        meatType[4] = "Chicken";
        meatType[5] = "Bacon";

        System.out.println("Choose a meat:\n"
                + "[0] "+meatType[0]+" "+ mediumMeatPrice[0]+"\n"
                + "[1] "+meatType[1]+" "+ mediumMeatPrice[1]+"\n"
                + "[2] "+meatType[2]+" "+ mediumMeatPrice[2]+"\n"
                + "[3] "+meatType[3]+" "+ mediumMeatPrice[3]+"\n"
                + "[4] "+meatType[4]+" "+ mediumMeatPrice[4]+"\n"
                + "[5] "+meatType[5]+" "+ mediumMeatPrice[5]);
        int choice = in.nextInt();
        System.out.println("Please enter a number to select meat");

        total += in.nextInt();
        System.out.println("Meat price for medium size is: " + total);

        int Yes = in.nextInt();

        if (Yes == 1) {
            double extraMeat = total + 1.00;
            System.out.println("Meat price for medium size sandwich is: " + extraMeat);

        } else {
            toppingCheese();
        }


    }

    public void meatLarge() {

        double total = 0;


        double[] largeMeatPrice = new double[6];
        largeMeatPrice[0] = 3.00;
        largeMeatPrice[1] = 3.00;
        largeMeatPrice[2] = 3.00;
        largeMeatPrice[3] = 3.00;
        largeMeatPrice[4] = 3.00;
        largeMeatPrice[5] = 3.00;


        //Size Array
        String[] meatType = new String[6];
        meatType[0] = "Steak";
        meatType[1] = "Ham";
        meatType[2] = "Salami";
        meatType[3] = "Roast Beef";
        meatType[4] = "Chicken";
        meatType[5] = "Bacon";

        System.out.println("Choose a meat:\n"
                + "[0] "+meatType[0]+" "+ largeMeatPrice[0]+"\n"
                + "[1] "+meatType[1]+" "+ largeMeatPrice[1]+"\n"
                + "[2] "+meatType[2]+" "+ largeMeatPrice[2]+"\n"
                + "[3] "+meatType[3]+" "+ largeMeatPrice[3]+"\n"
                + "[4] "+meatType[4]+" "+ largeMeatPrice[4]+"\n"
                + "[5] "+meatType[5]+" "+ largeMeatPrice[5]);
        int choice = in.nextInt();
        System.out.println("Please enter a number to select meat");

        total += in.nextInt();
        System.out.println("Meat price for large size is: " + total);

        System.out.println("Would you like extra meat?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int Yes = in.nextInt();

        if (Yes == 1) {
            double extraMeat = total + 1.50;
            System.out.println("Meat price for large size sandwich is: " + extraMeat);

        } else {
            toppingCheese();
        }


    }

    public void toppingCheese() {
        ArrayList<toppingTypes> toppingCheeseSc = new ArrayList<>();

        System.out.println("Choose your size to add Cheese");
        int select;
        System.out.println("1 - Add Cheese to small");
        System.out.println("2 - Add Cheese to Medium");
        System.out.println("3 - Add Cheese to Large");
        System.out.println("5 - Return to previous menu");

        System.out.println("Enter one of the numbers above!");

        select = in.nextInt();

        while (select != 5) {
            switch (select) {
                case 1:
                    cheeseSmall();
                    break;
                case 2:
                    cheeseMedium();

                case 3:
                    cheeseLarge();
                    break;


                case 4:

                    System.out.println("Choose your size to add meat");
                    System.out.println("1 - Add Cheese to small");
                    System.out.println("2 - Add Cheese to Medium");
                    System.out.println("3 - Add Cheese to Large");
                    System.out.println("5 - Return to previous menu");
                    select = in.nextInt();
            }
        }

    }

    public void cheeseSmall() {

        double total = 0;

        double[] smallCheesePrice = new double[6];
        smallCheesePrice[0] = 0.75;
        smallCheesePrice[1] = 0.75;
        smallCheesePrice[2] = 0.75;
        smallCheesePrice[3] = 0.75;

        //Size Array
        String[] cheeseType = new String[6];
        cheeseType[0] = "American";
        cheeseType[1] = "Provolone";
        cheeseType[2] = "Cheddar";
        cheeseType[3] = "Swiss";


        System.out.println("Choose a cheese:\n"
                + "[0] "+cheeseType[0]+" "+ smallCheesePrice[0]+"\n"
                + "[1] "+cheeseType[1]+" "+ smallCheesePrice[1]+"\n"
                + "[2] "+cheeseType[2]+" "+ smallCheesePrice[2]+"\n"
                + "[3] "+cheeseType[3]+" "+ smallCheesePrice[3]);

        int choice = in.nextInt();
        System.out.println("Please select a cheese");

        total += in.nextInt();
        System.out.println("Cheese price for small size sandwich is: " + total);

        System.out.println("Would you like extra cheese?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int Yes = in.nextInt();

        if (Yes == 1) {
            double extraCheese = total + .30;
            System.out.println("Cheese price for small size sandwich is: " + extraCheese);
            toppingVeggies();

        } else {
            toppingVeggies();
        }


    }


    public void cheeseMedium() {

        double total = 0;

        double[] mediumCheesePrice = new double[6];
        mediumCheesePrice[0] = 1.50;
        mediumCheesePrice[1] = 1.50;
        mediumCheesePrice[2] = 1.50;
        mediumCheesePrice[3] = 1.50;

        //Size Array
        String[] cheeseType = new String[6];
        cheeseType[0] = "American";
        cheeseType[1] = "Provolone";
        cheeseType[2] = "Cheddar";
        cheeseType[3] = "Swiss";


        System.out.println("Choose a cheese:\n"
                + "[0] "+cheeseType[0]+" "+ mediumCheesePrice[0]+"\n"
                + "[1] "+cheeseType[1]+" "+ mediumCheesePrice[1]+"\n"
                + "[2] "+cheeseType[2]+" "+ mediumCheesePrice[2]+"\n"
                + "[3] "+cheeseType[3]+" "+ mediumCheesePrice[3]);
        int choice = in.nextInt();
        System.out.println("Please select a cheese");

        total += in.nextInt();
        System.out.println("Cheese price for medium size sandwich is: " + total);

        System.out.println("Would you like extra cheese?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int Yes = in.nextInt();

        if (Yes == 1) {
            double extraCheese = total + .60;
            System.out.println("Cheese price for medium size sandwich is: " + extraCheese);
            toppingVeggies();

        } else {
            toppingVeggies();
        }

    }

    public void cheeseLarge() {

        double total = 0;

        double[] largeCheesePrice = new double[6];

        largeCheesePrice[0] = 2.25;
        largeCheesePrice[1] = 2.25;
        largeCheesePrice[2] = 2.25;
        largeCheesePrice[3] = 2.25;

        //Size Array
        String[] cheeseType = new String[6];
        cheeseType[0] = "American";
        cheeseType[1] = "Provolone";
        cheeseType[2] = "Cheddar";
        cheeseType[3] = "Swiss";


        System.out.println("Choose a cheese:\n"
                + "[0] "+cheeseType[0]+" "+ largeCheesePrice[0]+"\n"
                + "[1] "+cheeseType[1]+" "+ largeCheesePrice[1]+"\n"
                + "[2] "+cheeseType[2]+" "+ largeCheesePrice[2]+"\n"
                + "[3] "+cheeseType[3]+" "+ largeCheesePrice[3]);
        int choice = in.nextInt();
        System.out.println("Please select a cheese");

        total += in.nextInt();
        System.out.println("Cheese price for medium size sandwich is: " + total);

        System.out.println("Would you like extra cheese?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int Yes = in.nextInt();

        if (Yes == 1) {
            double extraCheese = total + .90;
            System.out.println("Cheese price for medium size sandwich is: " + extraCheese);
            toppingVeggies();

        } else {
            toppingVeggies();
        }

    }

    public void toppingVeggies() {

        double total = 0;



        //Size Array
        String[] veggiesType = new String[9];
        ArrayList<String> veggiesTypeList = new ArrayList<>();
        veggiesType[0] = "Lettuce";
        veggiesType[1] = "Peppers";
        veggiesType[2] = "Onions";
        veggiesType[3] = "Tomatoes";
        veggiesType[4] = "Jalapenos";
        veggiesType[5] = "Cucumbers";
        veggiesType[6] = "Pickles";
        veggiesType[7] = "Guacamole";
        veggiesType[8] = "Mushroom";



        System.out.println("Choose a veggie:\n"+


                "[0] "+veggiesType[0] + " \n"
                +"[1] "+veggiesType[1] + " \n"
                +"[2] "+veggiesType[2] + " \n"
                +"[3] "+veggiesType[3] + " \n"
                +"[4] "+veggiesType[4] + " \n"
                +"[5] "+veggiesType[5] + " \n"
                +"[6] "+veggiesType[6] + " \n"
                +"[7] "+veggiesType[7] + " \n"
                +"[8] "+ veggiesType[8] + " \n");
        int choice = in.nextInt();
        System.out.println("Please select a veggie");

        System.out.println("Would you like more veggies?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int Yes = in.nextInt();

        if (Yes == 1) {
            toppingVeggies();
        } else {
            toppingSauces();
        }




    }

public void toppingSauces(){

    double total = 0;



    //Size Array
    String[] saucesType = new String[9];
    saucesType[0] = "Mayo";
    saucesType[1] = "Mustard";
    saucesType[2] = "Ketchup";
    saucesType[3] = "Ranch";
    saucesType[4] = "Thousand Islands";
    saucesType[5] = "Vinaigrette";




    System.out.println("Choose a cheese:\n"
            +"[0] "+saucesType[0] +" \n"
            +"[1] "+saucesType[1] + " \n"
            +"[2] "+saucesType[2] + " \n"
            +"[3] "+saucesType[3] + " \n"
            +"[4] "+saucesType[4] + " \n"
            +"[5] "+saucesType[5] + " \n");

    int choice = in.nextInt();
    System.out.println("Please select a sauce");

    System.out.println("Would you like more sauce?");
    System.out.println("1 - Yes");
    System.out.println("2 - No");
    int Yes = in.nextInt();

    if (Yes == 1) {
        toppingSauces();
    } else {
        toppingSides();
    }



}

    public void toppingSides() {

        Toasted toastedObject = new Toasted();

        double total = 0;



        //Size Array
        String[] saucesType = new String[2];
        saucesType[0] = "Mayo";
        saucesType[1] = "Mustard";





        System.out.println("Choose a side:\n"
                +"[0] "+saucesType[0] +" \n"
                +"[1] "+saucesType[1] + " \n");
        int choice = in.nextInt();
        System.out.println("Please select a side");

        System.out.println("Would you like another side?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int Yes = in.nextInt();

        if (Yes == 1) {
            toppingSides();
        } else {
            toastedObject.toast();
        }



    }


}