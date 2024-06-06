package com.pluralsight;

import java.util.Scanner;

import static com.pluralsight.Delicious.orderSelection;

public class Toasted {
    static Scanner in = new Scanner(System.in);

    public void toast() {
        System.out.println("Would you like your sandwich toasted?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int Yes = in.nextInt();

        if (Yes == 1) {
         System.out.println("Toasted");
            orderSelection();

        } else {
            orderSelection();
        }
    }

}
