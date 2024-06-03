package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {

        String name = "Aleksandrs";
        String surname = "Taranenko";

        // My name is Aleksandrs Taranenko

        String myText = "My name is: " + name + " " + surname;
        System.out.println(myText);
        System.out.println("My name is: " + name + " " + surname);

        //Interpolation


        //Classwork

        String firstName = "Aleksandrs";
        String lastName = "Taranenko";
        int age = 33;
        String town = "Riga";

        //System.out.println(firstName + " " + lastName);

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println(firstName + " " + lastName + " is " + age + " years old and lives in " + town);
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, town));

        String result = String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, town);
        System.out.println(result);


    }
}
