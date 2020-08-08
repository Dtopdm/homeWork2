package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canGoOutside(25, 37));
        System.out.println(canGoOutside(53, 30));
        System.out.println(canGoOutside(13, 29));
        System.out.println(canGoOutside(8, -10));
        System.out.println(canGoOutside(79, 7));
    }


    public static String canGoOutside(int age, int temperature) {

        if (age >= 25 && age <= 45 && temperature >= -20 && temperature <= 30)
        {
            return "Можно идти гулять";
        }
        if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        }
        if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}


