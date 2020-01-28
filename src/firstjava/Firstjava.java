/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjava;

import java.util.Scanner;

/**
 *
 * @author Vikie
 */
public class Firstjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 180;//sum angles in a triangle
        double angle1, angle2, sum, angle3 = 0;//first and second angles
        Scanner num1 = new Scanner(System.in);
        System.out.println("enter first angle");

        angle1 = num1.nextDouble();
        System.out.println("enter second angle");
        angle2 = num1.nextDouble();
        sum = angle1 + angle2;//third number filled automatically
        if (sum <= 180) {
            angle3 = total - sum;
            System.out.print("the third angle has been auto completed to:");
            System.out.println(angle3);
            if ((angle2 == angle1) && (angle1 == angle3))//all sides equal{
            {
                System.out.println("The triangle is equilateral");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("The triangle is right_angled");
            } else if (angle1 != angle2 && angle2 != angle3 && angle1 != angle3) {
                System.out.println("the triangle is scalene");
            } else if ((angle1 == angle2 && angle2 != angle3) || (angle1 == angle3 && angle2 != angle3) || (angle2 == angle3 && angle3 != angle1)) {
                System.out.println("the triangle is isosceles");
            }
        } else {
            System.out.println("angles must sum up to 180");
        }

    }

}
