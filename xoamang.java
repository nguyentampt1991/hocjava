import java.util.Scanner;

public class xoaphantumang {
    public static void main(String[] args)
    {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(" Nhập mảng : ");
            size = sc.nextInt();
        }while (size<0);
        array = new int[size];
        int i=0;
        while (i< array.length){
            System.out.print(" mảng là :"+ (i+1)+":");
            array[i]= sc.nextInt();
            i++;
        }

        int k, c;

         System.out.print(" nhập phần tử k :");
        k= sc.nextInt();
        for(c= i =0;i<array.length;i++)
        {
            if(array[i] != k )
            {
                array[c]= array[i];
                c++;
            }
        }
        size = c;
        System.out.print("mảng sau khi xoa " + k + "\t:" );
        for(i=0; i<size;i++)
        {
            System.out.print(array[i] +"\t");
        }



    }
}
