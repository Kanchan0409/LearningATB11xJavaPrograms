package ex_03_Operators;

public class Lab_015_BODMAS {
    public static void main(String[] args) {
        System.out.println((9*3/9+1)*3); //output -> 12
        // BODMAS - B – Brackets, O – Order of powers or roots, D – Division, M – Multiplication A – Addition, and S – Subtraction
        // solve brackets first
        //9*3 = 27
        //27/9 = 3
        //3+1 = 4
        //4*3 = 12
    }
}
