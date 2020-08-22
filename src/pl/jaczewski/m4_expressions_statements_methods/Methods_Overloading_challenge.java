package pl.jaczewski.m4_expressions_statements_methods;

public class Methods_Overloading_challenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(145, 20));
        System.out.println(getDurationString(8));
    }

    public static String getDurationString (int minutes, int seconds) {
        if ((minutes >= 0) && ((seconds >= 0) && (seconds < 60))){
            int hours = minutes / 60;
            int minutesRemainder = minutes % 60;

            String hoursOutput;
            if (hours < 10) {
                hoursOutput = "0" + hours;
            } else {
                hoursOutput = "" + hours;
            }

            String minutesOutput;
            if (minutesRemainder < 10) {
                minutesOutput = "0" + minutesRemainder;
            } else {
                minutesOutput = "" + minutesRemainder;
            }

            String secondsOutput;
            if (seconds < 10) {
                secondsOutput = "0" + seconds;
            } else {
                secondsOutput = "" + seconds;
            }

            String finalOutput = minutes + " minutes and " + seconds + " seconds is "
                + hoursOutput + "h " + minutesOutput + "m " + secondsOutput + "s.";
             return finalOutput;
        } else {
            return "Invalid value";
        }
    }

    public static String getDurationString (int seconds) {
        if (seconds >= 0) {
            int minutesCalculated = seconds / 60;
            int secondsRemainder = seconds % 60;
            return getDurationString(minutesCalculated, secondsRemainder);
        } else {
            return "Invalid value";
        }
    }
}
