package Interview_Questions;

public class switch_case_ASCII {
    //expression will match with the ASCII value of the char
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("Do not match");
                break;
        }
    }
}
