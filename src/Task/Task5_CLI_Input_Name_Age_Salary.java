package Task;

public class Task5_CLI_Input_Name_Age_Salary {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end
        String name = args[0];
        System.out.println("Name is " + name);
        int age = Integer.parseInt(args[1]);
        System.out.println("Age is " + age);
        double salary = Double.parseDouble(args[2]);
        System.out.println("Salary is " + salary);
    }
}
