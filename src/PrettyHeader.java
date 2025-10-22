public class PrettyHeader {
    public static void main(String[] args) {
        prettyHeader("Have a good day!");
    }

    public static void prettyHeader(String msg) {
        int messageLength = msg.length();
        int marginLength = (54 - messageLength)/2;
        for (int counter = 1; counter <= 60; counter++) {
            System.out.print("*");
        }
        System.out.println(); // new line
        for (int counter = 1; counter <= 3; counter++) {
            System.out.print("*");
        }
        for(int counter = 1; counter <= marginLength; counter++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for(int counter = 1; counter <= marginLength; counter ++) {
            System.out.print(" ");
        }
        for (int counter = 1; counter <= 3; counter++) {
            System.out.print("*");
        }
        System.out.println();
        for (int counter = 1; counter <= 60; counter++) {
            System.out.print("*");
        }
    }
}