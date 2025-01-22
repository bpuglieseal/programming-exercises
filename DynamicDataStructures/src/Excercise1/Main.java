package Excercise1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int getRandomNumber (int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n;

        System.out.print("Input a number: ");
        n = sc.nextInt();

        for (int i = 0, j = 1; i < 10 && j <= (n / 2); j++) {
            if (n % j == 0) {
                list.add(j);
                i++;
            }
        }

        System.out.println("First 10 divisors of N: ");
        list.forEach(integer -> System.out.print(integer + " "));

        System.out.print("Deleting elements and filling with random numbers...");
        System.out.format("\n");
        list.clear();

        for (int i = 0; i < 20; i++) {
            list.add(getRandomNumber(-100, 100));
        }

        System.out.println("20 random numbers between -100 and 100: ");
        list.forEach(integer -> System.out.print(integer + " "));

        System.out.print("Deleting elements and filling with another 20 random numbers...");
        System.out.format("\n");
        list.clear();

        for (int i = 0; i < 20;) {
            int number = getRandomNumber(-20, 20);
            if (!list.contains(number)) {
                list.add(number);
                i++;
            }
        }

        System.out.println("20 random numbers between -20 and 20: ");
        list.forEach(integer -> System.out.print(integer + " "));
    }
}
