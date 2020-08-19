package pl.jaczewski.m_3_expressions_statements_methods;

// Zadanie
public class Methods_excercise {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
            // Kod powyżej sprawdza pozycję uzyskaną dzięki wynikowi 1500 punktów, a następnie
            // przypisujemy tę pozycję do zmiennej i przekazujemy do funkcji poniżej
        displayHighScorePosition("Krzysiek", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Adam", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Marek", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Jacek", position);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if ((score > 500) && (score <= 1000)) {
            // Drugiego warunku nie musimy zapisywać w kodzie, ponieważ ta opcja została już obsłużona w pierwszym 'if'
            return 2;
        } else if ((score <= 500) && (score > 100)) {
            return 3;
        } else {
            return 4;
        }
//        inne rozwiązanie, podejście z drugiej strony, mamy tu tylko jednego 'returna':
//
//        int position = 4;
//        if (score > 1000) {
//            position = 1;
//        } else if (score > 500) {
//            position = 2;
//        } else if (score > 100) {
//            position = 3;
//        }
//        return position;
    }
}
