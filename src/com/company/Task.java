package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Task {
    double[] startPoint = new double[]{1,1};
    double startValue = F(startPoint);
    final int v0 = 1;
    double[] currentPoint = new double[]{startPoint[0] + v0, startPoint[1]};
    double currentValue = F(currentPoint);
    public void run(){
        //trying if 1. direction is okay:
        System.out.println("[" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
        System.out.println("[" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
        if (currentValue < startValue){
            while(currentValue < startValue){
                startValue = currentValue;
                startPoint = currentPoint;
                currentPoint = new double[]{currentPoint[0] + v0, currentPoint[1]};
                currentValue = F(currentPoint);
                System.out.println("Start: [" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
                System.out.println("Biezacy: [" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
            }
        }else{
            System.out.println("Ten kierunek nie obniza wartosci funkcji.");
        }

        startPoint = currentPoint;
        startValue = currentValue;
        //trying if 2. direction is okay:
        System.out.println("[" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
        currentPoint = new double[]{currentPoint[0]  - 2 * v0, currentPoint[1]};
        currentValue = F(currentPoint);
        System.out.println("[" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
        if (currentValue < startValue){
            while(currentValue < startValue){
                System.out.println("Ten punkt obniza wartosc funkcji.");
                startValue = currentValue;
                startPoint = currentPoint;
                currentPoint = new double[]{currentPoint[0] - v0, currentPoint[1]};
                currentValue = F(currentPoint);
                System.out.println("Nowy punkt startowy: [" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
                System.out.println("Biezacy: [" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
            }
            System.out.println("Ten kierunek juz nie obniza wartosci funkcji");
        }else{
            System.out.println("Ten kierunek nie obniza wartosci funkcji.");
        }

        System.out.println("");
        startPoint = currentPoint;
        startValue = currentValue;
        //trying if 3. direction is okay:
        System.out.println("[" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
        currentPoint = new double[]{currentPoint[0], currentPoint[1] + v0};
        currentValue = F(currentPoint);
        System.out.println("[" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
        if (currentValue < startValue){
            while(currentValue < startValue){
                System.out.println("Ten punkt obniza wartosc funkcji.");
                startValue = currentValue;
                startPoint = currentPoint;
                currentPoint = new double[]{currentPoint[0], currentPoint[1] + v0};
                currentValue = F(currentPoint);
                System.out.println("Nowy punkt startowy: [" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
                System.out.println("Biezacy: [" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
            }
            System.out.println("Ten kierunek juz nie obniza wartosci funkcji");
        }else{
            System.out.println("Ten kierunek nie obniza wartosci funkcji.");
        }


        System.out.println("");
        startPoint = currentPoint;
        startValue = currentValue;
        //trying if 3. direction is okay:
        System.out.println("[" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
        currentPoint = new double[]{currentPoint[0], currentPoint[1] + v0};
        currentValue = F(currentPoint);
        System.out.println("[" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
        if (currentValue < startValue){
            while(currentValue < startValue){
                System.out.println("Ten punkt obniza wartosc funkcji.");
                startValue = currentValue;
                startPoint = currentPoint;
                currentPoint = new double[]{currentPoint[0], currentPoint[1] + v0};
                currentValue = F(currentPoint);
                System.out.println("Nowy punkt startowy: [" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
                System.out.println("Biezacy: [" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
            }
            System.out.println("Ten kierunek juz nie obniza wartosci funkcji");
        }else{
            System.out.println("Ten kierunek nie obniza wartosci funkcji.");
        }

    }

    public double F(double[] params){
        double x1 = params[0];
        double x2 = params[1];
        return x2*x2 - x1 * x2;
    }






//    private final int v = 1;
//    private double[] startPoint = new double[]{1,1};
//    private double valueOfStartPoint = F(startPoint);
//    private double valueOfCurrentPoint;
//    private double[] currentPoint = new double[]{1,1};
//    boolean timeToStop = false;
//    List<Double[]> history = new LinkedList<>();
//    public void run(){
//        history.add(new Double[]{1.0,1.0});
//        System.out.println("Punkt poczatkowy: [" + startPoint[0] + ", " + startPoint[1] +"] f(x) = " + valueOfStartPoint);
//        System.out.println("Zmiana dla  1. zmiennej: ");
//        generateNewPoint1D(v);
//        generateNewPoint1D(-2 * v);
//        System.out.println("Zmiana dla 2. zmiennej");
//        generateNewPoint2D(v);
//        generateNewPoint2D(-2 * v);
//        System.out.println("");
//        System.out.println("[" + startPoint[0] + ", " + startPoint[1] + " ]");
//        System.out.println("F(x) = " + F(startPoint));
//
//    }
//    public void generateNewPoint1D(double v0){
//        valueOfStartPoint = F(startPoint);
//        double x1 = startPoint[0] + v0;
//        System.out.println(x1);
//        int i = 0;
//        double[] newPoint = new double[]{x1,startPoint[1]};
//        System.out.println("[" + newPoint[0] + ", " + newPoint[1] + " ]");
//        double newValue = F(newPoint);
//        System.out.println(newValue);
//        System.out.println(valueOfStartPoint);
//        while(newValue < valueOfStartPoint){
//            valueOfStartPoint = newValue;
//            startPoint = newPoint;
//            System.out.println("[" + x1 + ", " + startPoint[1] + " ]");
//            System.out.println("F(x) = " + newValue);
//            final double x3 = x1;
//            System.out.println(history.stream().anyMatch(arr ->  ((arr[0] == x3) && (arr[1] == startPoint[1]))));
//            if (history.stream().anyMatch(arr ->  ((arr[0] == x3) && (arr[1] == startPoint[1])))){
//                System.out.println("ttt");
//                break;
//            }
//            history.add(new Double[]{x1, startPoint[1]});
//            x1 = x1 + v;
//            newValue = F(new double[]{x1,startPoint[1]});
//            i++;
//        }
//        if (i == 0) System.out.println("Dla 1 zmiennej pojscie krokiem " + v0 + " nie daje lepszych rezultatow.");
//    }
//    public void generateNewPoint2D(double v0){
//        valueOfStartPoint = F(startPoint);
//        int i = 0;
//        double x2 = startPoint[1] + v0;
//        double newValue = F(new double[]{startPoint[0],x2});
//        double [] newPoint = new double[]{startPoint[0],x2};
//        System.out.println("[" + newPoint[0] + ", " + newPoint[1] + " ]");
//        while(newValue < valueOfStartPoint){
//            valueOfStartPoint = F(new double[]{startPoint[0],x2});
//            startPoint = new double[]{startPoint[0], x2};
//            System.out.println("[" + startPoint[0] + ", " + x2 + " ]");
//            System.out.println("F(x) = " + newValue);
//            final double x3 = x2;
//            if (history.stream().anyMatch(arr ->  ((arr[1] == x3) && (arr[0] == startPoint[0])))) break;
//            x2 = x2 + v;
//            history.add(new Double[]{startPoint[0], x2});
//
//            newValue = F(new double[]{startPoint[0], x2});
//            i++;
//        }
//        if (i == 0) System.out.println("Dla 2. zmiennej pojscie krokiem " + v0 + " nie daje lepszych rezultatow.");
//    }
//    public double F(double[] params){
//        System.out.println();
//        double x1 = params[0];
//        double x2 = params[1];
//        return x1*x1 - x1 * x2;
//    }
}
