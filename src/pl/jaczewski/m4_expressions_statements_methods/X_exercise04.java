package pl.jaczewski.m4_expressions_statements_methods;

public class X_exercise04 {
    public static boolean isLeapYear (int year){
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                  return true;
                }
            } else {
                return false;
            }
        }
    }
}
