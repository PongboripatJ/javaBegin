/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Test {

    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\n");
        if (s.hasNextLine()) {
            s.useDelimiter("\\n");
            System.out.print("Age : ");
            int i;
            if (s.hasNextInt()) {
                i = s.nextInt();
                System.out.println("Your age is " + i);
            } else {
                s.next();
                System.out.println("That's not your age.");
            }
            System.out.print("What is your name : ");
        }
    }
