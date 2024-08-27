//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringPractice {
    public static void main(String[] args) {

        System.out.printf("\n welcome to my string practice!\n");

        // Create a string object
        String myPracticeStr;
        myPracticeStr = " Hello from my string practice program !";
        // use a string method
        // a mthod is a object-oriented language name for a function\
        // methods always have a pair of () attached to them
        // use the tolowercase()
        String myNewStr = "";
      myNewStr= myPracticeStr.toUpperCase();




                // prove it
        System.out.println("myNewStr is: " + myNewStr);
        // toLowerCase
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("myNewStr is : " + myNewStr);



        // find the length of our striing object.
        int myInt = myPracticeStr.length();
        // prove it !
        System.out.println("\n The length of " + myPracticeStr + "is" + myInt);
        // .contains()
        boolean isItThere;
        isItThere = myPracticeStr.contains("xyz");
        System.out.println(" The value of isItThere is : " + isItThere);
        //Char ar;
        int anotherInt = 4;
        char myChar = myPracticeStr.charAt(anotherInt);
        // Output the result
        System.out.println("\nThe character at index " + anotherInt + " is " + myChar);
}
}