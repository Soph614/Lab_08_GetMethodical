import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        boolean retVal = false;
        double price = 0;
        double userDouble = 0;
        do {
            userDouble = SafeInput.getRangedDouble(pipe, "Enter the price of your item", .50, 10.00);
            price = userDouble + price;
            pipe.nextLine();
            retVal = DevTest.getYNConfirm(pipe, "If you're done, press 'Y'; if not, press 'N'");
        } while(!retVal);
        System.out.println("Your total price is $" + price + ".");

    }
}