package pl.jaczewski.m5_control_flow_statements;

public class While_statement {

    public static void main(String[] args) {
        int count = 0;
        while(true){
            System.out.println("Count value is: " + count);
            count++;
            if (count == 6){
                break;
            }
        }

        int number = 4;
        int finishNumber = 10;
        int evenNumbersCount = 0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
                // polecenie 'continue' pomija kod poniżej i testuje następną inkrementację
                // (czyli wraca do początku 'if'/'while')
            }
            System.out.println("Even number: " + number);
            evenNumbersCount++;
            if (evenNumbersCount == 5){
                break;
            }
        }
        System.out.println("Total number of even numbers found: " + evenNumbersCount);
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}


// Modify the while code above
// Make it also record the total number of even numbers it has found
// and break once 5 are found
// and at the end, display the total number of even numbers found
