package com.mysite;

import java.util.Scanner;

public class Funct {


    Tasks tasks = new Tasks();
    Users users = new Users();


    public boolean logic(String name, String password) {
        if ((name.equals(users.def_name)) && (password.equals(users.def_password))) {
            System.out.println("login successful");
            return true;

        } else {
            System.out.println("Wrong password or Username" + "\n" + "Please try again");
            return false;
        }
    }


    public boolean login(boolean res) {
        Scanner in = new Scanner(System.in);
        boolean result = false;
        int i = 0;


        while (result == false && i < 3) {
            System.out.println("Please, enter your name ");
            String name = in.next();
            System.out.println("Please, enter your password ");
            String password = in.next();
            i++;

            result = logic(name, password);

        }

        return result;
    }

    public String Tasks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want to start");
        System.out.println("1.Even Number" + "\n2.Armstrong" + "\n3.Reverse" + "\n4.Fibonacci" + "\n5.Replace");

        String task = in.next();
        String result = " ";


        switch (task) {

            case "1": {
                result = tasks.evenNumber();
                break;
            }
            case "2": {
                result = tasks.armStrong();
                break;
            }
            case "3": {
                result = tasks.reverse();
                break;
            }
            case "4": {
                result = tasks.fibonacci();
                break;
            }
            case "5": {
                result = tasks.replace();
                break;
            }

            default:
                result = "wrong number of task";

        }
        System.out.println(result);
        return result;

    }

}


