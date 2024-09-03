// sF 9/3/24
// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ForEachRaya {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("\n welcome to my For : each practice.\n");


        // create an array of cars. Do this two different ways and be able to
        // your lab partner.

        // create a cars[] array using initialisation.
        String[] cars = {"BMW", "TESLA", "HONDA" };
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
        System.out.println("\n My for loop is done.");

        for (String car : cars) {
            System.out.println(car);
        }

        String[] myCars = new String[4];

        myCars[0] = "Tesla";
        myCars[1] = "BMW";
        myCars[2] = "HONDA";
        myCars[3] = "GMC";
        for (String urnon : myCars) {
            System.out.println(urnon);

        }

        String[] myStrings = new String[6];
        // use a for loop to fill the array with some strings.

// use a for loop to fill the array with some strings.

        for (int i = 0; i < myStrings.length; i++) {
            myStrings[i] = "String " + (i + 1); // Assign values to each element
        }


        for (String again : myStrings) {
            System.out.println("An element in myStrings[] is: " + again);
        }
        System.out.println("End of initial output");

        //create a reverse string.
        String reversedstr = "";
        //Output reversedstr.
        System.out.println("reversedstr before reversion loop is :" + reversedstr);
        for (int i = myStrToReverse)
    }
}



