package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print(" Tháng mà bạn muốn tìm số ngày là :");
        int month = sc.nextInt();
        switch (month)
        {
            case 2:
                System.out.print("tháng 2 có 28 hoặc 29 ngày ");
                break;
            case  1:
            case 3 :
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print(" tháng '"+ month +"'có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("tháng '"+ month +"' có 30 ngày");
                break;
            default:
                System.out.print("Invalid input");
                break;

        }
        int nam = sc.nextInt();
        System.out.print("Nhập số năm bạn muốn tính :");
        if(nam % 4 ==0){
          if( nam % 100 ==0)
               {
                 if ( nam % 400 ==0)
                   {
                      System.out.print("năm '"+ nam +"' là năm nhuận");
                   }else {
                     System.out.print("năm '"+ nam +"' là  không năm nhuận");
                 }
               }
         }

       }
}
