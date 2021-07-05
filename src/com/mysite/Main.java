package com.mysite;

public class Main {


    public static void main(String[] args) {
        Funct func = new Funct();


        if (func.login().equals("login successful"))
        {

            func.Tasks();
        }
    else{
            System.out.print("Error");
        }
    }
}







