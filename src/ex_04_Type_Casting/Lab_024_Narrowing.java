package ex_04_Type_Casting;

public class Lab_024_Narrowing {
    public static void main(String[] args) {
        //another example of explicit narrowing
        long phone_number = 987654321l;
        short s = (short) phone_number;
        System.out.println(s);
    }
}
