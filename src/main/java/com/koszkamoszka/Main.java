package com.koszkamoszka;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String a = scanner.nextLine();
        while (!a.isEmpty()) {
            list.add(a);
            a = scanner.nextLine();
        }

        String max = "";
        for (String line : list) {

            if (line.length() > max.length()) {

                max = line;

            }

        }

        System.out.println(max);
// asd asdfgh as ghj



    }

    public static int add(int a, int b) {
        return a + b;
    }
}