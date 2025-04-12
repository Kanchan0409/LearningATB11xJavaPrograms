package ex_07_If_Condition;

public class Lab_033_if_else {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("you cannot vote");
        }

    }
}
