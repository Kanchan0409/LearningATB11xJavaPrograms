package ex_05_Ternary_Operator;

public class Lab_028_Real_age_classification {
    public static void main(String[] args) {
        //Write a program based on the below condition to find the age category of a person.
        //Use CLI to take the user input (CLI option is present in Edit configuration in dropdown near the file name above.
        // if age > 18 -> adult
        // if age > 65 -> Senio        // if age < 18 -> minorr Citizen
        String age = args[0]; //CLI takes argument in String
        System.out.println(age); //Printing the value taken from cli
        int age1 = Integer.parseInt(age); //changing string to int
        String result = age1 < 18 ? "minor" : age1 >= 65 ? "Senior Citizen" : "Adult";
        System.out.println(result);
    }
}
