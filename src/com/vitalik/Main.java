package com.vitalik;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Test console application");

        String name;  // переменная для имени
        Scanner in = new Scanner(System.in);
       // name = con.readLine("Введите свое имя: ");
        System.out.print("Введите свое имя: ");
        name = in.nextLine();//считываем одну строку целиком

        //System.out.println("Name - " + name);
        System.out.println("Name - " + name);

    }
}
