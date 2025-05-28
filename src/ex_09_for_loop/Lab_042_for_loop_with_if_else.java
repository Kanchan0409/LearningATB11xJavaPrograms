package ex_09_for_loop;

public class Lab_042_for_loop_with_if_else {
    //The girl should get phone if the age is more than 15. Otherwise not
    public static void main(String[] args) {
        for(int girl = 0; girl < 18; girl++)
        {
            if(girl > 15)
            {
                System.out.println("She will get a phone" + girl);
            }
            else
            {
                System.out.println("No Phone" + girl);
            }
        }
    }
}
