package Task;

public class Task4_Pre_And_Post_Decrement {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        //--a = 19
        //a++ = 19
        //a-- = 20
        //--a + a++ + a-- = 58
        //a= 19

    }
}
