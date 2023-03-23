package com.example.demo3;

import java.util.Scanner;

class MarsCargoFuel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double MARS_GRAVITY = 3.721; // ускорение свободного падения на Марсе, м/с²
        final double FUEL_RATIO = 100.0; // количество топлива на 1 кг груза на Земле, кг

        System.out.print("Введите вес груза в килограммах: ");
        double cargoWeight = input.nextDouble();

        double fuelWeight = cargoWeight * MARS_GRAVITY / FUEL_RATIO;
        System.out.printf("Для вывода %.2f кг груза на орбиту Марса необходимо %.2f кг топлива.", cargoWeight, fuelWeight);

        input.close();
    }
}