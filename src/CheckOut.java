import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        double low = .50;
        double high = 10.00;
        String prompt = "Enter the price of your item (must be between " + low + " and " + high + " inclusive)";
        boolean done = false;
        do {
            SafeInput.getRangedDouble(pipe, prompt, low, high);
            SafeInput.getYNConfirm(pipe, prompt);
        }while(!done);
    }


    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String yesOrNo = "Y";
        prompt = "If you're done, press Y, if not, press N";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            yesOrNo = pipe.nextLine();
            if (yesOrNo.equalsIgnoreCase("Y")) {
                done = true;
            } else if(yesOrNo.equalsIgnoreCase("N")) {
                done = false;
            } else {
                System.out.println("That is not Y or N.");
            }
        } while (!yesOrNo.equalsIgnoreCase("Y") | !yesOrNo.equalsIgnoreCase("N"));
        return false;
    }
}

