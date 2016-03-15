package com.goit.gojavaonline.module3;

/**
 * Created by user on 15.03.2016.
 */
public class ConverterTemperature {
    public static double CONST_FARENGEIT = 33.8;
    public static double CONST_COFF = 1.8;

    public double convCF (double cels){
        return (CONST_COFF*cels)+CONST_FARENGEIT;
    }

    public double convFC (double fareng){
        return (fareng-CONST_FARENGEIT)/CONST_COFF;
    }

    public static void main(String[] args){
        double celsius = 36.6;

        ConverterTemperature converter = new ConverterTemperature();
        double convF = converter.convCF(celsius);
        System.out.println((int)convF);
        double convC = converter.convFC(convF);
        System.out.println(convC);

    }

}

