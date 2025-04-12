package ex_06_Increment_Decrement_Operator;

public class Lab_029_Pre_Increment {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // b = 10+1
        System.out.println(b); //output -> 11. since b have a+1 so the value of b is 11
        System.out.println(a); //output -> 11. since it is pre increment so the value of 'a' will be incremented first and become 11 and then printed.
    }
}
