package pl.jaczewski.m_4_expressions_statements_methods;

public class Methods_with_return {
    public static void main(String[] args) {

        calculateScore(true, 5000, 41, 100);

        calculateScore(true, 10000, 8, 200);
    }

    // Metoda ze zwracaniem wartości - w metodzie zamieniamy 'void' na typ zwracanych danych
    // Do tego dodajemy 'return' ORAZ koniecznie, co zwrócić, jeśli warunek 'if' nie zostanie spełniony
    public static int calculateScore(boolean gameOver, int score, int levelsCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelsCompleted * bonus);
            finalScore += 5000;
            System.out.println("Your final score is " + finalScore + ".");
            return finalScore;
        } else {
            return -1;
            // W programowaniu '-1' jest zwyczajowo używany, żeby zasygnalizować błąd
            // a w algorytmach wyszukiwania '-1' oznacza nieprawidłową wartość lub wartość nieznalezioną
        }
    }
}
