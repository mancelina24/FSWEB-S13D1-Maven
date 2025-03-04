package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,2));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(5.0));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        return isBarking && (clock < 8 || clock >= 21);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        return (firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit=isSummer? 45 : 35;
        return temp>=25 && temp <= upperLimit;
    }

    public static double area(double width, double height) {

        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }


    public static double area(double radius) {

        if(radius < 0)
        {
            return -1;
        }
        return radius*radius*Math.PI;
    }
}