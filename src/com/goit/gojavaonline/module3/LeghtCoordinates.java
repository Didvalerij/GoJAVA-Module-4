package com.goit.gojavaonline.module3;

/**
 * Created by user on 15.03.2016.
 */
public class LeghtCoordinates {

    public double leghtCoord(int x1, int y1, int x2, int y2){
       return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }

    public static void main(String[] args){
        int cordinateX1=5;
        int cordinateX2=-7;
        int cordinateY1=78;
        int cordinateY2=-50;

        LeghtCoordinates leghtCoordinates = new LeghtCoordinates();
        double leght = leghtCoordinates.leghtCoord(cordinateX1, cordinateX2, cordinateY1,cordinateY2);
        System.out.println(leght);
    }

}
