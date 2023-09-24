package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1 к урок 2. Исключения и их обработка.");
        float num = 0;
        boolean fl = true;
        while (fl) {
            view();
            num = numFloatIO_scanner();
            if (num != -1.0) {
                fl = false;
            }
        }
        System.out.println("\tВаше введеное значение ----------> " + num);
    }

    public static void view() {
        System.out.print("\n\tВведите дробное число (тип float): ");
    }


    public static float numFloatIO_scanner() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("\tНе верный ввод!");
            return -1;
        }
    }
}