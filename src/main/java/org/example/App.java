package org.example;

/**
 * Class with methods for property-based testing
 */
public class App {

    public int getClosestEven(int number) {
        return number % 2 == 0
                ? number
                : number - 1;
    }

    public int getClosestEvenError(int number) {
        return number % 2 == 0 || number > 5000
                ? number
                : number - 1;
    }

    public String getFullName(User user) {
        return user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName();
    }


    public static void main(String[] args) {
        System.out.println("Class for property-based testing!");
    }
}
