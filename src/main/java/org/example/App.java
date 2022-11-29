package org.example;

public class App {
    public static void main( String[] args ) {
        System.out.println("Звичайний ітератор:");
        for (Integer integer : new Range(1, 100)) {
            System.out.println(integer);
        }

        System.out.println("Покроковий ітератор:");
        for (Integer integer : new RangeWithStep(1, 10, 2)) {
            System.out.println(integer);
        }
    }
}
