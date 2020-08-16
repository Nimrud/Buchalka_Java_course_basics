package pl.jaczewski.m3_operators;

public class Operators {
    public static void main(String[] args) {

        //modulo - zwraca resztę z dzielenia
        int someInt = 7;
        int anotherInt = 3;
        int result = someInt % anotherInt;
        System.out.println("Reszta z dzielenia " + someInt + " przez " + anotherInt + " to " + result);

        //skróty operatorów (+,-,*,/)
        // result = result + 1;
        result++;
        System.out.println(result);

        result = 20;
        result--;
        System.out.println(result);

        // result = result + 3;
        result += 3;
        System.out.println(result);

        //result = result * 6;
        result *= 6;
        System.out.println(result);

        //result = result /3;
        result /= 3;
        System.out.println(result);

        boolean isOverEighteen = false;
        if (isOverEighteen == false) {
            System.out.println("Nie mogę Pani sprzedać alkoholu.");
            System.out.println("Proszę wrócić, za 2 lata.");
        }
        // Jeden znak "=" to przypisanie wartości
        // Dwa znaki "==" to sprawdzenie, czy warunek jest spełniony
        // Znak "!=" sprawdza, czy coś nie równa się jakiejś wartości

        int firstScore = 25;
        int secondScore = 22;
        if (firstScore > secondScore && firstScore > 20) {
            System.out.println("Pierwszy wynik jest większy od drugiego i jednocześnie większy od 20.");
        }

        int testPoints = 81;
        char grade;
        if (testPoints >= 90) {
            grade = '5';
        } else if (testPoints >= 80) {
            grade = '4';
        } else if (testPoints >= 60) {
            grade = '3';
        } else {
            grade = '2';
        }
        System.out.println("Ocena końcowa to " + grade + ".");
    }
}
