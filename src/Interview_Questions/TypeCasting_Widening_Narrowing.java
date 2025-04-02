package Interview_Questions;

public class TypeCasting_Widening_Narrowing {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = course+GST; //Implicit narrowing not possible
        int total1 = course + (int)GST; //explicit narrowing. But some data will be lost
        System.out.println(total1);

        float total2 = course + GST; // Implicit widening - valid
        System.out.println(total2);
        float total3 = (float)course + GST; // Explicit widening - valid
        System.out.println(total3);

    }
}
