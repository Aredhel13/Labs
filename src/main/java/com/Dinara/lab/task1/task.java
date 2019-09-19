package com.Dinara.lab.task1;

public class task {
    public static void main(String[] args) {
    int a=1;
    int b=2;
    int c = minimum(a,b);
        System.out.println(c);
    }

        public static int minimum(int a, int b){
            if(a>b)
                return b;
            else return a;
        }
}

