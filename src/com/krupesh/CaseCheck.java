package com.krupesh;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

//        Q. character is lowercase or uppercase?

        if(ch>='a' && ch<= 'z'){
            System.out.println(ch + " is lower case");
        }else {
            System.out.println(ch + " is uppercase");
        }
    }
}
