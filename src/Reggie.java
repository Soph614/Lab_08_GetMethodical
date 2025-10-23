import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String sSN = SafeInput.getRegExString(pipe, "Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(pipe, "Enter your UC Student M Number", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(pipe, "O = Open\nS = Save\nV = View\nQ = Quit\nEnter your menu choice", "^[OoSsVvQq]$");
    }
}
