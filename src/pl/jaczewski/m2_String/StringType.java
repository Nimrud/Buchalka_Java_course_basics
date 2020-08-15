package pl.jaczewski.m2_String;

public class StringType {
    public static void main(String[] args) {
        String firstString = "Pierwszy String tutaj";
        System.out.println(firstString);
        firstString = firstString + ", ale przecież nie pierwszy napisany w życiu ;-)";
        System.out.println(firstString);
        //możemy też dodawać znaki Unicode
        firstString = firstString + " \u00A92020";
        System.out.println(firstString);
    }
}
