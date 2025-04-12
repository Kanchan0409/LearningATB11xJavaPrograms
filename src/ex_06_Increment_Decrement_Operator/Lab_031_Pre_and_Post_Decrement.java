package ex_06_Increment_Decrement_Operator;

import org.w3c.dom.ls.LSOutput;

public class Lab_031_Pre_and_Post_Decrement {
    public static void main(String[] args) {
        // pre decrement
        int a = 10;
        int result1 = a--;
        System.out.println(result1); //result = 10
        System.out.println(a); // a = 9

        //Post decrement
        int b = 10;
        int result2 = --b;
        System.out.println(result2); // result = 9
        System.out.println(b); // b = 9
    }
}
