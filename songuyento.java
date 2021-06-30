import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" nhập số ");
        int A = sc.nextInt();
        if(A < 2)
        {
            System.out.print("số '"+ A +"' là số nguyên tố");
        }else
        {
            int i =2;
            boolean Check = true ;
            while (i <= Math.sqrt(A))
            {
                if (A % i ==0)
                {
                    Check = false;
                    break;
                }
                i++;
            }
            if (Check)
            {
                System.out.print(" số '"+ A + "' là số nguyên tố");
            }else
            {
                System.out.print(" số '" + A + "' không phải là số nguyên tố");
            }

        }

    }
}
