package org.example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(10);
        integers.add(30);
        integers.add(20);
        integers.add(40);


        System.out.println("Original list: " + integers);

        try {

            Set<Integer> uniqueIntegers = new HashSet<>(integers);


            int sum = calculateSum(uniqueIntegers);
            double average = calculateAverage(uniqueIntegers, sum);


            System.out.println("List without duplicates: " + uniqueIntegers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.err.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }


    private static int calculateSum(Set<Integer> integers) {
        int sum = 0;
        for (int num : integers) {
            sum += num;
        }
        return sum;
    }


    private static double calculateAverage(Set<Integer> integers, int sum) {
        if (integers.size() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) sum / integers.size();
    }
}
