package Task;

public class Task6_CLI_Input_Max_between_2_Number {
    public static void main(String[] args) {
        //Take a user input 2 numbers from the arguments and calculate the maximum in
        // between with ternary operator.
        String num1 = args[0];
        System.out.println("Number 1 is: "+ num1);
        int num_1 = Integer.parseInt(num1);

        String num2 = args[1];
        System.out.println("Number 2 is: "+ num2);
        int num_2 = Integer.parseInt(num2);

        int max = (num_1>num_2) ? num_1 : num_2;
        System.out.println("maximum is: " + max);


    }
}
