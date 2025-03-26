package ex_02_Java_Basic_Part2;

public class Lab_009_final_pi {
    public static void main(String[] args) {
        final float pi = 3.14f;
        // pi = 4.4f; this will give error (java: cannot assign a value to final variable pi)
        System.out.println(pi);

    }
}
