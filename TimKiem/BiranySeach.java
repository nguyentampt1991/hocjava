/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainning.TimKiem;

/**
 *
 * @author Tam Nguyen
 */
public class BiranySeach {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
    static int biranySeach(int[] list , int key){
        int low =0;
        int high = list.length - 1;
        while (high>= low) {            
            int mid = (low + high)/2;
            if( key <list[mid])
             high = mid-1;
                
           else if (key == list[mid])
               return mid;
            else
                low = mid+1;
            
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(biranySeach(list, 2));
        System.out.println(biranySeach(list, 11));
        System.out.println(biranySeach(list,79));
        System.out.println(biranySeach(list, 1));
        System.out.println(biranySeach(list, 5));
        System.out.println(biranySeach(list, 80));
        
    }
}
