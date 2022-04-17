package org.example;

/**
 * Hello world!
 */
public class App {

    public int getClosestEven(int number) {
        return number % 2 == 0
                ? number
                : number - 1;
    }

    public static void main(String[] args) {
        System.out.println("Class for property-based testing!");
    }
}
