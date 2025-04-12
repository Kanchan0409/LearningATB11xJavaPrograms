package ex_07_If_Condition;

import java.util.Scanner;

public class Lab_034_if_else_with_scanner_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();
        System.out.println(age);
        if (age>18){
            System.out.println("Person can vote");
        }else
        {
            System.out.println("Person cannot vote");
        }
    }
}
