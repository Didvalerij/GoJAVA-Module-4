package com.goit.gojavaonline.module3;

/**
 * Created by user on 15.03.2016.
 */
public class SquareTriangleRectangleCircle {

    public static double PI = 3.14;

    public double sqTriang ( double h,double o){
        return h*o*0.5;
    }

    public double sqRectangle ( double a,double b){
        return a*b;
    }

    public double sqCircle ( double r){
        return r*r*PI;
    }

    public static void main(String[] args){

        double sideA = 254.14;
        double sideB = 14.56;

        double trH = 12.5;
        double trO = 15;

        double circleR = 13;

        SquareTriangleRectangleCircle square = new SquareTriangleRectangleCircle();
        double sqTr = square.sqTriang(trH,trH);
        System.out.println(sqTr);
        double sqRec = square.sqRectangle(sideA,sideB);
        System.out.println(sqRec);
        double sqCir = square.sqCircle(circleR);
        System.out.println(sqCir);

    }

}
