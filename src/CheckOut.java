import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        boolean retVal = false;
        double price = 0.0;
        double userDouble = 0.0;
        do {
            userDouble = SafeInput.getRangedDouble(pipe, "Enter the price of your item", .50, 10.00);
            price = userDouble + price;
            // pipe.nextLine();
            retVal = SafeInput.getYNConfirm(pipe, "If you're done, press 'Y'; if not, press 'N'");
        } while(!retVal);
        System.out.printf("TOTAL PRICE: %5s", price);

    }
}