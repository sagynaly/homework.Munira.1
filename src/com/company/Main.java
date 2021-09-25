package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Munira;
        final int NUM = 27;
        String word = "age";
        Munira = NUM + word;
        System.out.println(Munira);

        if (NUM < 0 ){
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM >= 0){
            System.out.println("Высохранили положительное число");

        }else {
            System.out.println("Вы сохранили 0 ");

        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("выведите ваше имя");

        System.out.println("привет" + scanner.nextLine());


    }
}
