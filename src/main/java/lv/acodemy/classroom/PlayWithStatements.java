package lv.acodemy.classroom;

public class PlayWithStatements {
    public static void main(String[] args) {

        // if / (if-else) / if-else-if

        /*
        if(condition) {
        // code to be executed
        }
         */

        // E1. if a > 5 => System.out.println("This is true!");

        int a = 10;
        if (a > 5) {
            System.out.println("This is true");
        }

        // E2. Write program that will check if variable y is even

        int y = 8;
        if (y % 2 == 0) {
            System.out.println("y is even number");
        }

        // E3. Write program that will check if number is equal to 50;

        int b = 50;
        if (b == 50) {
            System.out.println("b is equal to 50");
        }

        // >, <, <= , =>, ==, != (comparison operators);

        if (b != y) {
            System.out.println("b is not equal to y");
        }

        // Boolean -> is or has (prefix)

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("It's time to go vocation");
        }

        //---if-else---

        /*
        if(condition) {
        will execute code if statement is true;
      } else {
       will execute code if statement is false;
      }
         */

        // E4. Write program that will check if number is positive;

        int z = 10;
        //int z = -10;
        if (z >= 0) {
            System.out.println("Z is positive number");
        } else {
            System.out.println("Z is negative number");
        }

        // E5. If name equal to John, then print out - We found John or Variable contains name John!

        String name = "John";
        // String name = "Enot";
        if (name.equals("John")) {
            System.out.println("Variable contains name John");
        } else {
            System.out.println("Variable contains name: " + name);
        }

        // if - else - if - else

        /*
        if(condition1) {
        if condition1 is true => this code block will be executed
        } else if (condition2) {
         if condition2 is true => this code block will be executed
        } else {
         if no condition is met => this code block will be executed
        }
         */

        // E6. Write program that will check if variable > 10, check if variable == 10, and all other is less than 10;

        int e = 13;
        if (e > 10) {
            System.out.println("Variable is more than 10");
        } else if (e == 10) {
            System.out.println("Variable is equal 10");
        } else {
            System.out.println("Variable is less than 10");
        }

        // E7. Create array with numbers, iterate through it and check if number is positive, negative or equal to 0;

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90,};
        /* for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (number > 0) {
                System.out.printf("Number: %d is positive number\n", number);
            } else if (number < 0) {
                System.out.printf("Number: %d is negative number\n", number);
            } else {
                System.out.printf("Number: %d is equal to 0\n", number);
         */

        for (int number : numbers) {
            if (number > 0) {
                System.out.printf("Number: %d is positive number\n", number);
            } else if (number < 0) {
                System.out.printf("Number: %d is negative number\n", number);
            } else {
                System.out.printf("Number: %d is equal to 0\n", number);
            }
        }

        // E8. Excellent (90-100) / Good (75-89) / OK (50-74) / NOK (0-49)

        int[] grades = {56, 27, 74, 89, 90, 99, 100, 13, 77, 95};

        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                System.out.printf("Grade %d is Excellent \n", grade);
            } else if (grade >= 75 && grade < 90) {
                System.out.printf("Grade %d is Good \n", grade);
            } else if (grade >= 50 && grade < 75) {
                System.out.printf("Grade %d is OK \n", grade);
            } else if (grade >= 0 && grade < 50) {
                System.out.printf("Grade %d is NOK \n", grade);
            } else {
                System.out.printf("Grade %d is UNKNOWN \n", grade);
            }
        }

        // Exercise 9: Create temperature classifier
        // Temperature < -10 (Holodno)  / from 0 to 10 (Prohladno) / from 10 to 20 (Teplo) / from 20 to 30 (Zharko) / > 30 - ochenj hot
        
    }
}
