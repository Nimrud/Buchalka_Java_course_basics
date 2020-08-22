package pl.jaczewski.m5_control_flow_statements;

public class Switch_statement {
    public static void main(String[] args) {

        char letter = 'D';

        switch (letter) {
            case 'A':
                System.out.println("The letter was an 'A'");
                break;
            case 'B': case 'C': case 'D':
                System.out.println("The letter was a " + letter);
                break;
            case 'E':
                System.out.println("The letter was an 'E'");
                break;
            default:
                System.out.println("Not found");
        }

        // Od Javy 7 można w poleceniu switch dawać też Stringi
        String month = "FEbruAry";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("JAN");
                break;
            case "february":
                System.out.println("FEB");
                break;
            case "march":
                System.out.println("MAR");
                break;
            default:
                System.out.println("Not a first quarter of the year");
        }
    }
}
