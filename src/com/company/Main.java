package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
    }

    public static int sumn(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumn(n - 1);
    }

    public static boolean isanagram(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void cofee() {
        Scanner scan = new Scanner(System.in);
        float price = 0;
        System.out.println("enter the number of the type of coffee you want");
        System.out.println("1.americanno 2.latte 3.espresso 4.capuchino");
        byte choice = scan.nextByte();
        switch (choice) {
            case (1):
                System.out.println("Select coffe size 1.Small-1$   2.big-2$");
                if (scan.nextByte() == 1) {
                    price = 1;
                } else price = 2;
                break;
            case (2):
                System.out.println("Select coffe size 1.Small-3$   2.big-6$");
                if (scan.nextByte() == 1) {
                    price = 3;
                } else price = 6;
                break;
            case (3):
                System.out.println("Select coffe size 1.Small-0,5$   2.big-1$");
                if (scan.nextByte() == 1) {
                    price = 0.5f;
                } else price = 1;
                break;
            case (4):
                System.out.println("Select coffe size 1.Small-4$   2.big-8$");
                if (scan.nextByte() == 1) {
                    price = 4;
                } else price = 8;
                break;
        }
        System.out.println("how much coffe do you want");
        short amount = scan.nextShort();
        System.out.println("you must pay " + price * amount + "$");


    }
}

