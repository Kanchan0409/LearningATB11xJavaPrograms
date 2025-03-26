package ex_03_Operators;

public class Lab_010_Arithmetic_operators {
    public static void main(String[] args) {
        int a = 20; // = is assignment operator
        int b = 3;
        float c = 3f;
        // Some examples of arithmetic operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // this will round off the value to 6 as int data type is selected as operand.
        System.out.println(a/c); // this will give exact value 6.66 as float data type is used.

    }
}
