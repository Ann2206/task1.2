package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму денег в рублях");
        int sumMoney = sc.nextInt();

    if (sumMoney % 100 == 11 || sumMoney % 100 == 12 || sumMoney % 100 ==13 || sumMoney % 100 == 14 ){
    System.out.println ( sumMoney + "рублей" );
        }else if (sumMoney % 10 == 1 ) {
            System.out.println(sumMoney + "рубль");
        } else if (sumMoney % 10 == 2 || sumMoney % 10 == 3 || sumMoney % 10 == 4) {
            System.out.println(sumMoney + "рубля");
        } else if (sumMoney % 10 == 5 || sumMoney % 10 == 6 || sumMoney % 10 == 7 || sumMoney % 10 == 8 || sumMoney % 10 == 9 || sumMoney % 10 == 0 ) {
            System.out.println(sumMoney + "рублей");
        }
    }
}