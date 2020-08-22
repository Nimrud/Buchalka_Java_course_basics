package pl.jaczewski.m4_expressions_statements_methods;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelsCompleted = 41;
        int bonus = 100;
        calculateScore(gameOver, score, levelsCompleted, bonus);

        //jeszcze bardziej skrócony zapis - podajemy tylko wartości do samej metody
        calculateScore(true, 10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelsCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelsCompleted * bonus);
            finalScore += 5000;
            System.out.println("Your final score is " + finalScore + ".");
        }
    }
}
