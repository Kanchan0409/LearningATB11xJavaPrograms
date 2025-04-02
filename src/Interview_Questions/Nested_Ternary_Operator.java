package Interview_Questions;

public class Nested_Ternary_Operator {
    public static void main(String[] args) {
        int num = 15;
        String result = num > 10 ? (num > 20 ? "num is greater than 20" : "num is less than 20" ) : "Num is less than 10";
        System.out.println(result);
    }
}
