package com.uc6_demonstrating_static;

public class DemonstratingStatic {
        static int a = 10; //static variables are class level variables they can't be called using objects. Memory allocation occurs during class loading
        static int b;
        public static void demo ( int c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    public static void main(String[] args) {
            DemonstratingStatic.demo(30);
        }
        //static blocks are used to initialize static variables and it executes during the class loading
        static {
        b = a + 10;
        }
    }
