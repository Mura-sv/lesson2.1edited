package com.company;

public class Main {

    public static void main(String[] args) {
        ;
        System.out.println(ageAndTemperature(22, 14));
        System.out.println(ageAndTemperature(14, 20));
        System.out.println(ageAndTemperature(40, 0));
        System.out.println(ageAndTemperature(11, -20));
        System.out.println(ageAndTemperature(20, 30));


    }

    public static String ageAndTemperature(int age, int temp) {

        if ((age > 20 && age < 45) && (temp > -20 && temp < 30)) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && (temp >= 0 && temp < 28)) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && (temp > -10 && temp < 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return "Age=" + age + " Temperature=" + temp;
    }
}