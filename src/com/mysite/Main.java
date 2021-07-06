package com.mysite;

public class Main {


    public static void main(String[] args) {
        Funct func = new Funct();


        if (func.login(true)) {

            func.Tasks();
        } else {
            func.login(false);
            System.out.println("Error");

        }
    }
}







