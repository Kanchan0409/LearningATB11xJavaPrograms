package Interview_Questions;

public class switch_case_02 {
    public static void main(String[] args) {
        //-1 in expression will match -1 in the case
        int a = 10;
        switch (-1)
        {
            default -> System.out.println("This is default");
            case -1 -> System.out.println("10");
            case 9 -> System.out.println("9");
        }
    }
}
