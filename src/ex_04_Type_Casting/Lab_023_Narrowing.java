package ex_04_Type_Casting;

public class Lab_023_Narrowing {
    public static void main(String[] args) {
        int a = 300;
        //byte b = a; // Implicit narrowing not possible.
        byte b = (byte) a; // Explicit narrowing - valid
        System.out.println(b);
        //output is 44 because:
        /* int a=300; -> int means 32 bits memory required
        0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
        byte b1=(byte)a; -> byte means 8 bits memory required
        0 0 1 0 1 1 0 0
        Value is
        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44.
        (00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀*/
    }
}
