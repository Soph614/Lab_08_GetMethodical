import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        boolean done = false;
        do {
            SafeInput.getRangedDouble(pipe, "Enter the price of your item", .50, 10.00);
            SafeInput.getYNConfirm(pipe, "If you're done, press Y; if not, press N");
        } while (!done);

    }
}