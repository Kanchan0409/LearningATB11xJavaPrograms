package ex_08_switch;

public class Lab_037_switch_new_way {
    public static void main(String[] args) {
        int itemcode = 001;
        switch (itemcode)
        {
            //this new way cases with arrow (->) is possible only after JDK 13.
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("Default");
        }
    }
}
