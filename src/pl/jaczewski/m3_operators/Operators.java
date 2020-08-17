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

        //Oba warunki spełnione (&&) lub tylko jeden z nich (||)
        int firstScore = 25;
        int secondScore = 22;
        if ((firstScore > secondScore) && (firstScore > 20)) {
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

        boolean isCar = false;
        if(!isCar){    // Tu sprawdzamy, czy isCar nie jest równy true (isCar != true)
                        // (isCar == false) lub (isCar != true) lub (!isCar)
                        // (isCar == true) lub po prostu (isCar)
            System.out.println("Nie jest równy 'true'.");
        }

        //Ternary operator (potrójny operator)
        boolean isNew = true;
        boolean isItNew = isNew ? true : false;
            // Pierwsza część (isNew) to coś, co chcemy zbadać;
            // Druga część (true) to wartość, którą przypiszemy isItNew, jeśli badana rzecz (isNew) jest prawdą;
            // Trzecia część (false) to wartość, która zostanie przypisana do isItNew, jeśli isNew jest fałszem.
        if (isItNew) {
            System.out.println("It is true");
        }

        boolean examPassed = true;
        char wasItPassed = examPassed ? 'z' : 'n';
        System.out.println(wasItPassed);

        String didIMakeIt = (testPoints >= 60) ? "Egzamin zaliczony" : "Dwója! Wstyd!";
        System.out.println(didIMakeIt);

        // Zadanie
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double sumOfDoublesMultiplied = (firstDouble + secondDouble) * 100;
        double doublesRemainder = sumOfDoublesMultiplied % 40.00;
        boolean isRemainderZero = (doublesRemainder == 0) ? true : false;
        System.out.println(isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder.");
        }
    }
}
