package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Konto konto1=new Konto();
        output(String.valueOf("Konto 1: " +konto1.get()*2));
    
    output("-------------------------");

        Konto konto2=new Konto();
        output(String.valueOf("Konto 2: " + konto2.get()*3));

    output("-------------------------");

        Konto konto3=new Konto();
        output(String.valueOf("Konto 3: " + konto3.get()*10));

    output("-------------------------");
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

