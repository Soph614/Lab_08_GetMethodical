import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        SafeInput.getInt(pipe, "Enter your favorite integer");
        SafeInput.getDouble(pipe, "Enter your favorite double value (_._)");
    }
}
