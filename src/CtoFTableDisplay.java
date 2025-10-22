public class CtoFTableDisplay {
    public static void main(String[] args) {
        double Celsius = -101;
        String doubleSpace = "  ";
        for(int i = 0; i <= 200; i++) {
            double fahrenheit = CtoF(Celsius);
            Celsius = Celsius + 1.0;
            System.out.print("\n");
            System.out.printf("%.1f\t%.1f", Celsius, fahrenheit);
        }

    }
    public static double CtoF(double Celsius) {
        double fahrenheit = (Celsius * 9.0/5.0) + 32;
        return fahrenheit;
    }

}
