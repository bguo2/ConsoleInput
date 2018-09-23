package com.mypackage;

import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Input integer:");
        int test1 = in.nextInt();
        in.nextLine(); //eat the last cartridge return

        System.out.println("Input string:");
        String test4 = in.nextLine();

        System.out.println("input float:");
        float test2 = in.nextFloat();
        in.nextLine(); //eat the last cartridge return

        System.out.println();
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test4);
    }
}
