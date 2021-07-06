/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainning.ThuatToanSapXep;

/**
 *
 * @author Tam Nguyen
 */
public class SapXepChen {
    static double[] list = {1, 9, 8, 6.6, 12, -7.0};

    public static void main(String[] args){
        System.out.println("List origin: ");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("List after sort");
        insertionSort(list);
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }

    public static void insertionSort(double[] list){
        for(int out = 1; out < list.length; out++){
            double temp = list[out];
            int in = out;
            while(in > 0 && list[in - 1] > temp){
                list[in] = list[in - 1];
                in--;
            }
            list[in] = temp;
        }
    }
}
