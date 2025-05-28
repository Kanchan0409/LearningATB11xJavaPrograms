package ex_08_switch;

import java.util.Scanner;

public class Lab_036_switch_choose_browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a browser");
        String browser = sc.next();

        switch (browser) {
            case "chrome":
                System.out.println("Staring the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Staring the firefox");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("I have no idea what this browser is");
                break;

        }
    }
}
