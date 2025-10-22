import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        SafeInput.getRangedInt(pipe, "Enter what year you were born in [1950-2015]", 1950, 2015);
        int dayChoice = SafeInput.getRangedInt(pipe, "Enter what month of the year you were born in [1-12]", 1, 12);
        switch(dayChoice) {
            case 1, 3, 5, 7, 8, 10, 12:
                SafeInput.getRangedInt(pipe, "Enter what day of the month you were born in [1-31]", 1, 31);
                break;
            case 2:
                SafeInput.getRangedInt(pipe, "Enter what day of the month you were born in [1-29]", 1, 29);
                break;
            case 4, 6, 9, 11:
                SafeInput.getRangedInt(pipe, "Enter what day of the month you were born in [1-30]", 1, 30);
                break;
        }
        SafeInput.getRangedInt(pipe, "Enter what hour of the day you were born in [1-24]", 1, 24);
        SafeInput.getRangedInt(pipe, "Enter what minute of the hour you were born in [1-59]", 1, 59);

    }
}