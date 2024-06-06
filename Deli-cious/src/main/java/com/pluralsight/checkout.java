package com.pluralsight;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/*public class checkout {
    public static void reciept(){



        sandwichOrder sandwichOrderObject = new sandwichOrder();
        sandwichSize sandwichSizeObject = new sandwichSize();
        toppingTypes toppingTypesObject = new toppingTypes();
        drinkOrder drinkOrderObject = new drinkOrder();
        chipsOrder chipsOrderObject = new chipsOrder();





        Date thisDate = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/Y hh:mm a");
        System.out.println(dateForm.format(thisDate));


        String[] paymentInfo = { thisDate +sandwichOrderObject.sandwichOrders() +sandwichSizeObject.sandwichSizes()
                +toppingTypesObject.meatSmall()+"|"+toppingTypesObject.meatMedium()+"|"+toppingTypesObject.meatLarge()+
                "|"+toppingTypesObject.cheeseSmall() +"|"+toppingTypesObject.cheeseMedium()+"|"+toppingTypesObject.cheeseLarge()
                +"|"+toppingTypesObject.toppingVeggies()+"|"+toppingTypesObject.toppingSauces()+"|"+toppingTypesObject.toppingSides()
                +"|"+drinkOrderObject.drinkOrders()+"|"+chipsOrderObject.chipsOrders()+"|"+String.valueOf()};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv",true));
            for (String paymentInf : paymentInfo) {
                writer.write("\n" + paymentInf);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return ;
    }


}
\*
 */
