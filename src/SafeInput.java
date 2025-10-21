import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        boolean done = false;
        do {
            prompt = "Please give an integer";
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                int userInt = pipe.nextInt();
                System.out.println("Your integer is " + userInt + ".");
                done = true;
            } else if (pipe.hasNextDouble()) {
                double doubleTrash = pipe.nextDouble();
                System.out.println(doubleTrash + " is not an integer.");
            } else {
                String trash = pipe.nextLine();
                System.out.println(trash + " is not an integer.");
            }
        } while (!done);
        return 0;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        boolean done = false;
        prompt = "Please give a double value";
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                int intTrash = pipe.nextInt();
                System.out.println("[" + intTrash + "] is not a double value.");
                pipe.nextLine();
            } else if (pipe.hasNextDouble()) {
                double userDouble = pipe.nextDouble();
                System.out.println("Your double value is " + userDouble + ".");
                done = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("[" + trash + "] is not a double value.");
                // pipe.nextLine();
            }
        } while (!done);
        return 0;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {

        prompt = "Choose a number between 1 and 100 inclusive";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                int userInt = pipe.nextInt();
                if (userInt >= 1 && userInt <= 100) {
                    System.out.println("You chose " + userInt + ".");
                    done = true;
                } else {
                    System.out.println("That integer is not between 1 and 100 inclusive.");
                }

            } else if (pipe.hasNextDouble()) {
                double doubleTrash = pipe.nextDouble();
                System.out.println("[" + doubleTrash + "] is not an integer at all.");
                pipe.nextLine(); // clears the buffer
            } else {
                String trash = pipe.nextLine();
                System.out.println("[" + trash + "] is not an integer at all.");
                // pipe.nextLine();
            }

        } while (!done);

        return low;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                int trash = pipe.nextInt();
                System.out.println("[" + trash + "] is not a double value at all.");
                pipe.nextLine();

            } else if (pipe.hasNextDouble()) {
                double userDouble = pipe.nextDouble();
                if (userDouble >= low && userDouble <= high) {
                    System.out.println("You chose " + userDouble + ".");
                    done = true;
                } else {
                    System.out.println("That double value is not between " + low + " and " + high + " inclusive.");
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("[" + trash + "] is not a double value at all.");
                // pipe.nextLine();
            }

        } while (!done);
        return low;
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
            } else if (yesOrNo.equalsIgnoreCase("N")) {
                done = false;
            } else {
                System.out.println("That is not Y or N.");
            }
        } while (!yesOrNo.equalsIgnoreCase("Y") | !yesOrNo.equalsIgnoreCase("N"));
        return false;
    }
}

