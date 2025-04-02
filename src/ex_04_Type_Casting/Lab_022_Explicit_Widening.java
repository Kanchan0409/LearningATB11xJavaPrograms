package ex_04_Type_Casting;

public class Lab_022_Explicit_Widening {
    public static void main(String[] args) {
        byte b = 20;
        int a = (int) b; //converting smaller data type (byte) into bigger data type (int) by specifying the new data type of variable b.
        System.out.println(a);
    }
}
