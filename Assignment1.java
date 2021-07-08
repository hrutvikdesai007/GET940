//Written by Hrutvik Desai

import java.util.*;
import java.io.*;

class Assignment1 {

    public static void main(String args[]) {

        System.out.println("");
        System.out.println("********ASSIGNMENT 1********");
        System.out.println("");

        System.out.println("********Electricity Bill********");
        float r = 1.20f;
        float c = 0.0f;
        System.out.println("");

        System.out.println("Standard Unit Price : " + r);

        System.out.print("Enter the units : ");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        System.out.println("");

        if (units < 100) {
            c = r * units;
        } else if (units <= 300 && units >= 100) {
            float t1 = r * 100;
            float t2 = 2 * (units - 100);
            c = t1 + t2;
        } else {
            if (units > 300) {
                float t1 = r * 100;
                float t2 = 2 * 200;
                float t3 = 3 * (units - 300);
                c = t1 + t2 + t3;
            }
        }
        System.out.println("Final electricity bill : " + c);
        System.out.println("");
    }
}
