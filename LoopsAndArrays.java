//SF 8/29/24
// /*
//
import java.util.Scanner;

public class LoopsAndArrays {
    public static void main(String[] args) {
       // create a scanner object for user input.
        Scanner scanner = new scanner(System.in)
        System.out.println("\n welcome to my friendly for Loop Program \n");
        // create a loop that displays ' Hello There" five times
        // the loop control variablr of this for loop is named i (it means integer(whole number))
        //loop control variable must be: initialized, checked, and changed

        for(int i = 0; i<50;i++) {
            System.out.println("the value of i is: " + i);
            myNumbers[i]  = scanner.nextInt();

        }
        // output the myNumbers[] array.... with a for loop, using the length property
        for (int i = 0; i<10; i++){
            System.out.println(" the value of myNumbers[" + i+ "] is : " + myNumbers[i]);

        // create a while loop that does the same thing.
        int loopcontrolvariable=0;
        while (loopcontrolvariable<10){
            System.out.println("the value of loopcontrolvariable is: " + loopcontrolvariable);
        // change the loop control variablle.
        loopcontrolvariable++;
        }
        // create a string array of five words.
        //string[] names = new String[10]
        String[] names = { "one","two","three","four","five","six","seven","eight","nine","ten"};
        // create an integer array with 10 elemnts
        int[] myNumbers = new int[10];
        // use a for loop to grt ten whole numbers from the user.
        for (int i = 0; i<10; i++){
            System.out.println();
        }
        System.out.println("ONE OF OUR NAME IS:"+ names[4]);
        // output the length our array named name.
        System.out.println("\n the length of our array 'names' is: " + names.length);

        // create a four loop that outputs all element values in the names array.
        for (int i=0; i<names.length; i++) {
            System.out.println("names[" +i+ "] is... " + names[i]);
            System.out.println("\n this is the end of our program \n");

        }



    }
}