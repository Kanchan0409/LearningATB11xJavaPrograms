package ex_08_switch;

public class Lab038_switch_multiple_case {
    public static void main(String[] args) {
        //multiple cases in switch is possible after JDK 13
        int itemcode = 005;
        switch (itemcode)
        {
            case 001, 002, 003:
                System.out.println("These all the electronic items");
                break;
            case 004, 005:
                System.out.println("These are mechanical items");
                break;
            default:
                System.out.println("this is default");
        }
    }
}
