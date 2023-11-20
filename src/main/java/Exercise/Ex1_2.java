/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

/**
 *
 * @author Priyanka
 * Write a program that displays the area and
    perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
    formula:
area = width * height
 */
public class Ex1_2 {
    public static void main( String args[]){
        
        //declare variables
        double area;
        double perimeter;
        double width = 4.5;
        double height = 7.9;
        
        //calculate area an perimeter
        area = width * height;
        perimeter = 2 * (width + height);
        
        //display result on console
        System.out.println("Area = " + area + "\nPerimeter = " + perimeter );
    }
    
}
