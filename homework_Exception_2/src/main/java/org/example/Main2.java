package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("\nЗадача 4 к урок 2. Исключения и их обработка.");
        view();
        strIO_scanner();
    }

    public static void view() {
        System.out.print("\n\tВведите любые символы: ");
    }


    public static void strIO_scanner() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str == null || str.isEmpty() || str.matches("\s*")) {
            try {
                throw new Exception("\tПустые строки вводить нельзя!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("\tСупер - Вы ввели корректные данные.");
        }


    }
}
