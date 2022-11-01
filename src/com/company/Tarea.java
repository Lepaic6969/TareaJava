package com.company;

import java.sql.SQLOutput;

public class Tarea {
    public static void main(String[] args) {
        //1 numericos

        //1.1 enteros
        byte variable1=2;
        short variable2=10;
        int variable3=30;
        long variable4=100;
        System.out.println("***************** DATOS NUMÉRICOS DEL TIPO DE DATO ENTERO *****************************");
        System.out.println("Imprimiendo el tipo de dato byte: "+variable1);
        System.out.println("Imprimiendo el tipo de dato short: "+variable2);
        System.out.println("Imprimiendo el tipo de dato int: "+variable3);
        System.out.println("Imprimiendo el tipo de dato long: "+variable4);
        System.out.println("\n");

        System.out.println("**********************DATOS NUMÉRICOS DECIMALES********************************************");
        //1.2 decimales

        float variable5=5.5f;
        double variable6=10.5d;
        System.out.println("Imprimiendo el tipo de dato float: "+variable5);
        System.out.println("Imprimiendo el tipo de dato double: "+variable6);
        System.out.println("\n");

        //2 booleanos

        System.out.println("******************DATOS BOOLEANOS*****************************");

        boolean variable7=false;
        boolean variable8=true;
        System.out.println("Imprimiendo el tipo de dato boolean - false: "+variable7);
        System.out.println("Imprimiendo el tipo de dato boolean -true: "+variable8);
        System.out.println("\n");

        System.out.println("****************** CARACTERES Y CADENAS DE CARACTERES *****************************");
        //3 Texto

        char variable9='e';
        String variable10="aeiou";
        System.out.println("Imprimiendo el tipo de dato char: "+variable9);
        System.out.println("Imprimiendo el tipo de String char: "+variable10);
    }
}
