import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        SafeInput.getNonZeroLenString(pipe, "Enter your name");
    }
}

