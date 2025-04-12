package Task;
import java.lang.Math;
public class Task1_Math_Functions {
    public static void main(String[] args) {
        {
            //equation -> ∛(x^2 + y^2 - |z|)
            int x = 10;
            int y = 10;
            int z = 10;
            System.out.println("The result of the expression ∛(x^2 + y^2 - |z|) is : " + Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z)));
        }
    }
}
