package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {

        // One-line comment

        /*
        Multi-line comment
        I can also write here
         */

        // Category: Integer

        //Byte:
        byte smallNumber = 120;

        // RGB (Red Green Blue)
        byte red = 120;
        byte green = 45;
        byte blue = 127;
        System.out.println(blue);

        // Int - (Integer)
        // Employee ID:
        int employId = 123456;

        // Population count:
        int populationOfLatvia = 1811956;
        System.out.println(populationOfLatvia);

        // short
        // Game Score
        short playerScore = 15000;

        // Year of birth
        short yearOfBirth = 1990;

        // char (Character)
        // Grade:
        char grade = 'A';

        // Initials:
        char firstInitial = 'A';
        char lastInitial = 'T';

        // long
        // Bank Account Balance
        long accountBalance = 1000000L;
        System.out.println(accountBalance);

        // Java7
        // Improves readability
        long population = 1_000_000_000L; //1 billion

        // Avoiding mistake
        int creditCardNumber = 1234_5678;

        // double
        // PI
        double piValue = Math.PI;
        System.out.println(piValue);

        // Another way
        double pi = 3.14_15_92;

        // Floating Number
        // Float
        // Price
        float price = 1_234_567_8998_98F;

        // Double
        // Financial Debt:
        double financeDebit = 23_456_789_123.45555;

        //Distance
        double distanceToSun = 149_549_870_3; //in km

        // Boolean (true / false)
        // has or is prefix;

        boolean isSummer = false;
        boolean hasSon = false;
        boolean hasBMW = true;

        // String - we can save here any text in double quotes

        String firstName = "Aleksandrs";
        String lastName = "Taranenko";

        //var
        var myCurrentAge = 33;
        var myFullName = "Aleksandrs Taranenko";

        // Operators:
        // * - multiplication (8 * 8)
        // / - division (8 / 2)
        // + - Addition (5 + 5)
        // - - Subtraction (10 - 4)
        // --  (-1)
        //  ++ (+1)
        // % (the remainder after dividing a by b)
        
        boolean evenNumber = 4 % 2 == 0; //true
        boolean oddNumber = 4 % 3 == 0; // false

        int remainderResult = 5 % 3;
        System.out.println(remainderResult);

        // Operators (Simple example)
        int x = 10;
        int y = 20;
        int result = x + y;

        int a = 30;
        int b = 40;
        int anotherResult = a - b;

        int c = 10 + 20;
    }
}
