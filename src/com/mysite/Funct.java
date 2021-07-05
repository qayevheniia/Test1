package com.mysite;

import java.util.Scanner;

public class Funct {

    String def_name = "y";
    String def_password = "p";
    Tasks tasks = new Tasks();



    public String login() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your name ");
        String name = in.next();
        System.out.println("Please, enter your password ");
        String password = in.next();

        String result = " ";

        if ((name.equals(def_name)) && (password.equals(def_password))) {
            result = "login successful";
        } else {
            result = "Error";
        }
        System.out.println(result);
        return result;
    }
    public String Tasks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want to start");
        System.out.println("1.Even Number" +"\n2.Armstrong" +"\n3.Reverse" +"\n4.Fibonacci" +"\n5.Replace");

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


