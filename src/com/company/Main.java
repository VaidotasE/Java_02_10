package com.company;

import java.util.Scanner;


public class Main {

    static float a;
    static float b;

    public static void main(String[] args) {

        duomenys();
        suma(a, b);
        skirtumas(a, b);
        sandauga(a, b);

    }

    public static void duomenys() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk du skaicius: ");
        a = sc.nextFloat();
        b = sc.nextFloat();

        System.out.println("Atsakymai: " + suma(a, b));
        System.out.println("Atsakymai: " + skirtumas(a, b));
        System.out.println("Atsakymai: " + sandauga(a, b));
    }

    public static float suma(float a, float b) {
        return a + b;
    }

    public static float skirtumas(float a, float b) {
        return a - b;
    }

    public static float sandauga(float a, float b) {
        return a * b;
    }
}
