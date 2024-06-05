package lv.acodemy.classroom;

import java.util.Arrays;
import java.util.stream.Stream;

public class PlayWithArrays {
    public static void main(String[] args) {

        //Arrays

        //Declaring Arrays
        //Enter array with integer data type

        int[] numbers;

        //Creating an array
        numbers = new int[18];
        //int[] numbers = new int[18];

        System.out.println(Arrays.toString(numbers));

        //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        //[0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16, 0, 18]

        numbers[1] = 2;
        numbers[3] = 4;
        numbers[5] = 6;
        numbers[7] = 8;
        numbers[9] = 10;
        numbers[11] = 12;
        numbers[13] = 14;
        numbers[15] = 16;
        numbers[17] = 18;
        System.out.println(Arrays.toString(numbers));

        // Create int array with numbers

        int[] evenNumbers = {2, 4, 6, 8, 10, 12,};

        /*evenNumbers[6] = 10;

        System.out.println(Arrays.toString(evenNumbers));*/

        // Create String array with names

        String[] names = {"Jhon", "Michael", "Anna", "Mary"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        // Create String array that will contain fruits
        // Array should contain at least 5 fruits
        // Print each fruit separately

        String[] fruits = {"Apple", "Banana", "Melon", "Lemon", "Peach"};

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(fruits[4]);

        Stream.of(fruits).forEach(System.out::println);
        Stream.of(fruits).filter(s -> s.equals("Peach")).forEach(System.out::println);
    }
}