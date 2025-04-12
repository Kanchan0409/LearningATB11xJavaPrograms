package ex_06_Increment_Decrement_Operator;

public class Lab_030_Post_Increment {
    public static void main(String[] args) {
        //Example 1
        int a = 10;
        System.out.println(a++); // this will print 10 as post increment prints the value first and then increments it.
        System.out.println(a); // this will print 11 as the incremented value (11) is now stored in a.

        //Example 2
        int x = 20;
        int result = x++; // result = 20. after this x value will get increment to 21
        System.out.println(x);
        System.out.println(result);

        //Example 3
        int b = 30;
        System.out.println(b++ + b); //b++ = 30. after that b will become 31. so 30+31 = 61

        //Example 4
        int c = 10;
        System.out.println(c++ + ++c); //c++ = 10, after that c=11. ++c = 12. so c++ + ++c = 10+12 = 22
        System.out.println(c); // c = 12

        //Example 5
        int d = 10;
        System.out.println(++d + ++d); // output = 23. ++d = 11. again ++d = 12. so ++d + ++d = 11+12=23
        System.out.println(d); // d= 12

    }
}
