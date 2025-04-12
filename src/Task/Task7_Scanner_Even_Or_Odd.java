package Task;

import java.util.Scanner;

public class Task7_Scanner_Even_Or_Odd {
    public static void main(String[] args) {
        //Take user input & Check weather the input is even or odd number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        String result = (num%2==0) ? "Even number" : "Odd Number";
        System.out.println(result);
    }
}
