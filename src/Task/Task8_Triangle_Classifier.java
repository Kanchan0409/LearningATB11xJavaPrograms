package Task;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task8_Triangle_Classifier {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of Triangle: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        System.out.println("Side 1 is: " + side1);
        System.out.println("Side 2 is: " + side2);
        System.out.println("Side 3 is: " + side3);
        if(side1 == side2 && side2 == side3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1)
        {
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }

    }
}
