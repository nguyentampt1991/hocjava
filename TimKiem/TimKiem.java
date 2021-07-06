/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainning.TimKiem;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Tam Nguyen
 */
public class TimKiem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        
        for(int i=0; i<string.length();i++)
        {
            LinkedList<Character> list= new LinkedList<>();
            list.add(string.charAt(i));
            for(int j = i+1;j<string.length();j++)
            {
                if(string.charAt(i) > list.getLast())
                {
                    list.add(string.charAt(j));
                }
            }
            if(list.size()> max.size())
            {
                max.clear();
                max.addAll(list);
            }
            list.clear();
                
        }
        // hiển thị chuỗi tăng dần dài nhất
        for(Character ch :max)
        {
            System.out.println(ch);
        }
        System.out.println();
    }
}
