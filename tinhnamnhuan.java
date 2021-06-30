import java.util.Scanner;

public class tinhnnamnhuan {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Nhập số năm bạn muốn tính :");
        int year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }

    }

