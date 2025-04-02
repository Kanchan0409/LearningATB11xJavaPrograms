package Interview_Questions;

public class Ternary_Operator_max_between_3_num {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = -5;
        //Logic :
        //If n1 is greater than n2, check it with n3, if n3 is greater than n2 then n3 is greater otherwise n1.
        // If n2 is less than n2 that means n2 is greater, check it with n3. if n2 > n3 then n3 is greater otherwise n2

        int max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(max);
    }
}
