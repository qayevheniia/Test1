package com.mysite;
import java.util.Scanner;
import java.util.Arrays;


public class Tasks {
    Scanner sc = new Scanner(System.in);

    public String evenNumber() {
        System.out.println("Please, enter number");

            while (!sc.hasNextInt()) {
                System.out.println("That not a number!" +"\nPLease enter number");
                sc.next(); // this is important!
            }

        int number = sc.nextInt();
        String result = " ";

        if (number % 2 == 0) {
            result = "This number is: even";
        } else if (number % 2 != 0){
            result = "it's not even";
        }
        return result;
    }

    public String armStrong() {

        System.out.println("Please, enter number");
        int n = sc.nextInt();
        String result = " ";

        int b = 0, c = n;

        while (n > 0) {
            int a = n % 10;
            n = n / 10;
            b = b + (a * a * a);
        }
        if (c == b) {
            result = "Armstrong number";
        } else {
            result = " Not Armstrong number";
        }


        return result;
    }
    public String reverse() {
        System.out.println("Please, enter string");

        String str = sc.nextLine();
        String result = " ";
        char[] array = str.toCharArray();

            for (int i = array.length - 1; i >= 0; i--) {
                result = result + array[i];
            }
            return result;


    }
    public String fibonacci() {

        String result = " ";

        long [] arr = new long [50];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        result = Arrays.toString(arr);
        return result;


    }
    public String replace() {

        String result = "";
        System.out.println("Please, enter string");
        String str = sc.nextLine();
        String replace = str.replace('a', '@').replace('o','0');

        char[] array = replace.toCharArray();

        for (int i = 0; i < replace.length() && i<30; i++) {
            result +=array[i];

        }
        return result;



    }

}













