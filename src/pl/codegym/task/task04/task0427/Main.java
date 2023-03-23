package pl.codegym.task.task04.task0427;

import java.io.*;

/**
 Created by xciechan
 on 2023-03-23

 The application checks parity number and number of digits
 Range of numbers: 1-999
 */

public class Main {
    public static void main(String[] args) throws IOException {
        printSolution(readNumber());
    }

    public static int readNumber () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());

        return number;
    }

    public static boolean isParity (int number){
        return number % 2 == 0 ? true : false;
    }

    public static int numberOfDigits (int number){
        return String.valueOf(number).length();
    }

    public static void printSolution (int number){
        if ((number > 0) && (number < 1000)) {
            switch (numberOfDigits(number)) {
                case 1:
                    if (isParity(number)) {
                        System.out.println("parzysta liczba jednocyfrowa");
                    } else {
                        System.out.println("nieparzysta liczba jednocyfrowa");
                    }
                    break;

                case 2:
                    if (isParity(number)) {
                        System.out.println("parzysta liczba dwucyfrowa");
                    } else {
                        System.out.println("nieparzysta liczba dwucyfrowa");
                    }
                    break;

                case 3:
                    if (isParity(number)) {
                        System.out.println("parzysta liczba trzycyfrowa");
                    } else {
                        System.out.println("nieparzysta liczba trzycyfrowa");
                    }
                    break;

                default:
                    break;
            }
        }
    }

}