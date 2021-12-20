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
        double Cels = console.nextDouble();
        System.out.println(Cels + "°C" + " = " + (Cels * 9 / 5 + 32) + "°F" + " = " + (Cels + 273.15) + "K");
    }
}

