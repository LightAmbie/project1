package ru.mirea.kvbo01.lazarev;

import java.util.Scanner;

public class TaskManager {
    public static void task3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Array length: ");
        int arrLen = Integer.parseInt(input.nextLine());

        double[] arr = new double[arrLen];
        double sum = 0;
        double average = 0;

        for(int i=0;i<arrLen;i++){
            System.out.print("Number input: ");
            double num = Double.parseDouble(input.nextLine());
            arr[i] = num;
            sum += num;
        }

        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+(sum/arrLen));
    }

    public static void task4(){
        Scanner input = new Scanner(System.in);
        System.out.print("Array length: ");
        int arrLen = Integer.parseInt(input.nextLine());

        double[] arr = new double[arrLen];
        int i = 0;
        double sum = 0;
        double maxe = Double.NEGATIVE_INFINITY;
        double mine = Double.POSITIVE_INFINITY;

        while(i<arrLen){
            System.out.print("Number input: ");
            double num = Double.parseDouble(input.nextLine());
            maxe = Math.max(num, maxe);
            mine = Math.min(num, mine);
            arr[i] = num;
            sum += num;
            i++;
        }

        System.out.println("The sum is: "+sum);
        System.out.println("Max element: "+maxe);
        System.out.println("Min element: "+mine);
    }

    public static void task5(String[] args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }

    public static void task6(){
        double sum = 0;

        for(double i=1;i<11;i++){
            sum += 1/i;
            System.out.printf("Number " + i + " is: %.4f\n", sum);
        }
    }

    public static int fact(int n){
        int res = 1;
        int cnt = n;
        for(int i=0;i<n;i++){
            res *= cnt;
            cnt--;
        }
        return res;
    }
}
