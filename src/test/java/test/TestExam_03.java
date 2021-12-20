package test;

import java.util.Scanner;

/**
 * Напишите класс BaseConverter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
 * и делает конвертацию.
 */

public class TestExam_03 {
    public static void main(String[] args) {
        System.out.println("Введите значение в градусах Цельсия");
        Scanner console = new Scanner(System.in);
        double cels = console.nextDouble();
        System.out.println(cels + "°C" + " = " + (cels * 9 / 5 + 32) + "°F" + " = " + (cels + 273.15) + "K");

        System.out.println("Введите значение в градусах Фаренгейта");
        //Scanner console = new Scanner(System.in);
        double fahr = console.nextDouble();
        System.out.println(fahr + "°F" + " = " + ((fahr - 32) * 5.0 / 9) + "°C" + " = " + (((fahr - 32) * 5.0 / 9)+273.15)
        +"K");

        System.out.println("Введите значение в Кельвинах");
        //Scanner console = new Scanner(System.in);
        double kelv = console.nextDouble();
        System.out.println(kelv + "K" + " = " + ((kelv - 273.15) * 9 / 5 + 32)  + "°F" + " = " + (kelv - 273.15) + "°C");

    }
}

