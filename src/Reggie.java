import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        DevTest.getRegExString(pipe, "Enter your social security number", "^\\\\d{3}-\\\\d{2}-\\\\d{4}$");
        DevTest.getRegExString(pipe, "Enter your UC Student M Number", "^(M|m)\\\\d{5}$");
        DevTest.getRegExString(pipe, "Enter your menu choice", "^[OoSsVvQq]$");
    }
}
