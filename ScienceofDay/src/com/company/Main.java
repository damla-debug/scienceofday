package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner out = new Scanner(System.in);
         int [] digit= new int[6];
         String [] days= {"monday"," tuesday","wednesday","thursday","friday","saturday","sunday"};



            System.out.println("enter a year");
           int y = out.nextInt();

            System.out.println("enter the day of month 1-31");
           int q = out.nextInt();
            System.out.println("enter the month 1-12");
           int m = out.nextInt();

        if(m ==1){
          m=13;
            y-=1;
        } else if(m==2){
            m=14;
            y-=1;
        }
        int j= y/100;
        int k= y%100;
        int h= (q+ (26*(m+1)/10) +k + k/4 + j/+ + 5*j)% 7;


        for (int a = 0; a <7; a++) {
            digit[a]=h;
            String day= days[digit[a]];
         System.out.println(day);
         break;
        }
    }
}
