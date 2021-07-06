/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainning.NgoaiLeVaDeBug;

import java.util.Scanner;

/**
 *
 * @author Tam Nguyen
 */
public class IllegalTriangleExceptionAssignment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] triangle = new double[3];
        System.out.println("Please input 3 sides of triangle:");
        System.out.print("Side 1: ");
        triangle[0] = Double.parseDouble(sc.nextLine());
        System.out.print("Side 2: ");
        triangle[1] = Double.parseDouble(sc.nextLine());
        System.out.print("Side 3: ");
        triangle[2] = Double.parseDouble(sc.nextLine());

        try{
            isIllegal(triangle[0], triangle[1], triangle[2]);
            System.out.println("This is a triangle");
        } catch (IllegalAccessError e){
            System.out.println(e.getMessage());
        }
    }

    public static void isIllegal(double side1, double side2, double side3) throws IllegalAccessError{
        if(side1+side2<side3 || side1+side3<side2 || side2+side3<side1){
            throw new IllegalAccessError("Not a triangle");
        }
    }
}
