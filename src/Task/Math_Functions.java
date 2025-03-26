package Task;
import java.lang.Math;
public class Math_Functions {
    public static void main(String[] args) {
        {
            //equation -> ∛(x^2 + y^2 + |z|)
            int x = 10;
            int y = 10;
            int z = -10;
            int a = Math.abs(z);
            double b = Math.pow(x, 2);
            double c = Math.pow(y, 2);
            // double d = a + b + c;
            double e = Math.cbrt(a+b+c);


            System.out.println("The result of the expression ∛(x^2 + y^2 + |z|) is : " + e);

        }
    }
}
