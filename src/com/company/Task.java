package com.company;

import java.util.LinkedList;

public class Task {
    final long[] point = new long[]{1, 1};
    long[] startPoint = new long[]{1, 1};
    long startValue = F(startPoint);
    final int v0 = 1;
    long[] currentPoint = new long[]{startPoint[0] + v0, startPoint[1]};
    long currentValue = F(currentPoint);
    boolean stepSucceed = false;
    LinkedList<Long[]> history = new LinkedList<>(); //For displaying road (if needed)
    public void run() {
        //trying if 1. direction is okay:
        while(!stepSucceed) {
            stepSucceed = false; // restart activity after full successful iteration
            firstDimension(1);

            startPoint = currentPoint;
            startValue = currentValue;
            //trying if 2. direction is okay:
            currentPoint = new long[]{currentPoint[0] - 2 * v0, currentPoint[1]};
            currentValue = F(currentPoint);
            firstDimension(-1);

            if (!stepSucceed) {
                currentPoint = point;
                startPoint = point;
            }
            //trying if 3. direction is okay:
            currentPoint = new long[]{currentPoint[0], currentPoint[1] + v0};
            currentValue = F(currentPoint);
            secondDimension(1);
            //trying if 4. direction is okay:
            currentPoint = new long[]{currentPoint[0], currentPoint[1] - 2 * v0};
            currentValue = F(currentPoint);
            secondDimension(-1);
            startPoint = currentPoint;
            startValue = currentValue;
        }
    }

    private void firstDimension(int v) {
        System.out.println("\n\n");
        System.out.println("Start: [" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
        System.out.println("Aktualny punkt: [" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
        if (currentValue < startValue) {
            stepSucceed = true;
            while (currentValue < startValue) {
                System.out.println("Ten punkt obniza wartosc funkcji.");
                history.addLast(new Long[]{currentPoint[0], currentPoint[1]});
                startValue = currentValue;
                startPoint = currentPoint;
                currentPoint = new long[]{currentPoint[0] + v, currentPoint[1]};
                currentValue = F(currentPoint);
                System.out.println("Nowy punkt startowy: [" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
                System.out.println("Aktualny: [" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
            }
            System.out.println("Ten kierunek juz nie obniza wartosci funkcji");
        } else {
            System.out.println("Ten kierunek nie obniza wartosci funkcji.");
        }
    }

    private void secondDimension(int v) {
        System.out.println("");
        startPoint = currentPoint;
        startValue = currentValue;
        System.out.println("\n\n");
        System.out.println("Start: [" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
        System.out.println("Aktualny punkt: [" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
        if (currentValue < startValue) {
            stepSucceed = true;
            while (currentValue < startValue) {
                System.out.println("Ten punkt obniza wartosc funkcji.");
                history.addLast(new Long[]{currentPoint[0], currentPoint[1]});
                startValue = currentValue;
                startPoint = currentPoint;
                currentPoint = new long[]{currentPoint[0], currentPoint[1] + v};
                currentValue = F(currentPoint);
                System.out.println("Nowy punkt startowy: [" + startPoint[0] + ", " + startPoint[1] + "] f(x) = " + startValue);
                System.out.println("Aktualny: [" + currentPoint[0] + ", " + currentPoint[1] + "] f(x) = " + currentValue);
            }
            System.out.println("Ten kierunek juz nie obniza wartosci funkcji");
        } else {
            System.out.println("Ten kierunek nie obniza wartosci funkcji.");
        }
    }

    public long F(long[] params) {
        long x1 = params[0];
        long x2 = params[1];
        return x2*x2 + x1 * x2;
    }

}