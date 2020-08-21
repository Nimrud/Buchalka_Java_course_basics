package pl.jaczewski.m_4_expressions_statements_methods;

public class Method_Overloading {
    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(10, 6);

        double pureInchesToCentimeters = calcFeetAndInchesToCentimeters(17);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet >= 0) && ((inches >= 0) && (inches <= 12))) {
            double centimeters = inches * 2.54 + (feet * 12) * 2.54;
            System.out.println(feet + " feet and " + inches + " inches is " + centimeters + " centimeters.");
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches parameter.");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches >= 0)  {
            double feet = (int) inches / 12;
            double inchesRemainder = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inchesRemainder);
        } else {
            System.out.println("Value must be greater than 0.");
            return -1;
        }
    }

}
