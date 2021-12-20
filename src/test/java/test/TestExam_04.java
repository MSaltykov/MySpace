package test;

import java.util.Scanner;

/**
 * Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов.
 * На вход функции подаётся время в виде двух переменных: "hours" и "minutes"
 */

public class TestExam_04 {
    public static void main(String[] args) {
        System.out.println("Введите часы и минуты");
        Scanner console = new Scanner(System.in);
        int hours = console.nextInt();
        int minutes = console.nextInt();
        if (hours > 23) System.out.println("Неверное значение часов");
        //if (23 >= hours > 12) hours = (hours - 12);
        if (minutes > 59) System.out.println("Неверное значение минут");
        double angle;
        int h = (hours * 30) + ((minutes / 60) * 6);
        int m = minutes * 6;

        System.out.println("Угол между часовой и минутной стрелками составляет " + (Math.abs(h - m)) + " градусов");
    }
}
