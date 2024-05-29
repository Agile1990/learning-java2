package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {

        // One-line comment
        /* Multi-line comment

         */

        // Category: Integer

        //Byte:
        byte smallNumber = 120;
        // RGB (Red Green Blue)
        byte red = 120;
        byte green = 45;
        byte blue = 127;
        System.out.println(blue);

        //Int - (Integer)
        int employId = 123456;
        //Population count:
        int populationOfLatvia = 1811956;
        System.out.println(populationOfLatvia);

        //short
        //Game Score
        short playerScore = 15000;

        // Year of birth
        short yearOfBirth = 1990;

        //char (Character)
        char firstInitial = 'A';
        char lastInitial = 'T';

        //long
        // Bank Account Balance
        long accountBalance = 1000000L;
        System.out.println(accountBalance);

        // Java7
        // Improves readability
        long population = 1_000_000_000L; //1 billion

        //Avoiding mistake
        int creditCardNumber = 1234_5678;

        //double
        // PI

        double piValue = Math.PI;
        System.out.println(piValue);

        // Floating Number
        //Price
        float price = 1_234_567_8998_98F;

        double financeDebit = 23_456_789_45555;

        //Distance

        double distanceToSun = 149_549_870_3; //in km

        //Boolian
        // has or is prefix

        boolian isSummer = false;
        boolian hasSon = false;
        boolian hasBMW = true;

        // String - we can save here any text in double quotes

        String firstName = "Aleksandrs";
        String lastName = "Taranenko";

        //var
        var myCurrentAge = 33;
        var myFullName = "Aleksandrs Taranenko";


        //Operators
        // * - multiplication (8*8)
        // / - division (8/2)


        boolian evenNumber = 4 % 2 == 0; //true
        boolian oddNumber = 4 % 3 == 0 // false

        int remainderResult = 5 % 3;
        System.out.println(remainderResult);


    }
}
