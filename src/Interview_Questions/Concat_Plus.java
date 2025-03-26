package Interview_Questions;

import javax.print.attribute.Size2DSyntax;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Concat_Plus {
    public static void main(String[] args) {
        // + operator concatenates 2 strings if it is used with Strings
        System.out.println("kanchan" + "Meher");
        // another way with strings
        String s1 = "kanchan", s2 = "Meher";
        System.out.println(s1 + s2);

        // with integers + operator will perform plus arithmetic operation
        int a = 10, b = 20;
        System.out.println(a+b);

        //Important thing to remember
        System.out.println(s1 + s2 + a + b); // this will give output as -> kanchanMeher1020
        //a + b will not behave as integer and plus operation will not be performed
        // because since JVM finds s1 first which is a string so it will treat the rest operation as concatenation and not plus

        System.out.println(a + b + s1 + s2); // output -> 30kanchanMeher
        // since JVM finds a + b first so it will perform plus operation on a and b
        // since s1 and s2 are string so it will concat them as plus operation cannot be performed on s1 and s2.

        // If you want concat should be performed with strings and plus with int then use brackets
        System.out.println(s1 + s2 + (a+b)); //output will be kanchanMeher30
    }
}
