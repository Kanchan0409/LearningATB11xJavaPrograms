package Interview_Questions;

public class Char_plus {
    public static void main(String[] args) {
        char a1 = 'A'; //ASCII value 65
        char a2 = 'B'; //ASCII value 66
        System.out.println(a1 + a2); // output -> 131
        // a1 + a2 = 65+66 = 131
        // Since char is also a type of int so JVM will perform plus operation on the basis of their ASCII values

        System.out.println('A' == 65); // output -> True. As it is matching with its ASCII value
    }
}
