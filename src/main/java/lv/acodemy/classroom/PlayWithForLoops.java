package lv.acodemy.classroom;

public class PlayWithForLoops {
    public static void main(String[] args) {

        //Print numbers 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Print all even numbers from 2 to 20

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        //Calculate sum of numbers from 1 - 10

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);

        //Print elements from array

        int[] numbers = {13, 30, 50, 60, 70, 100, 150};

        for (int i : numbers) {
            System.out.println(i);
        }

        /* for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        } */


        //Print numbers in reverse order from 10 to 1

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Print multiplication Table (5)

        int number = 5;
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(String.format("%d * %d = %d", number, i, result));
            //System.out.println(number + " " + i + " " + result);
        }
    }
}