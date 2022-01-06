package com.yukinissie;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i == 2) {
                for (int j = 1; j <= 11; j++) {
                    System.out.print(" ー");
                }
                System.out.print('\n');
            }
            for (int j = 1; j <= 9; j++) {
                if (j == 2) {
                    System.out.print(" |");
                }
                int num_result = i * j;
                String str_result = num_result < 10 ? " " + String.valueOf(num_result) : String.valueOf(num_result);
                System.out.printf(" %s", str_result);
            }
            System.out.print('\n');
        }
    }
}
