package pl.jaczewski.m_4_expressions_statements_methods;

public class ExpressionsAndStatements {
    public static void main(String[] args) {

        // expression = variables + values + operators (bez średnika na końcu!)
                // kilometers = 100 * 1.609
        // while (value < 50) { }  <= tu wszystko w nawiasie to expression
        // przy metodach: wszystko w nawiasie to expression
                // System.out.println("This is an expression");
        // statement (deklaracja) = expression + data type + semicolon at end
                // double kilometers = 100 * 1.609

        boolean gameOver = true;
        int score = 5000;
        int levelsCompleted = 41;
        int bonus = 100;

        if (gameOver == true) {
            int finalScore = score + (levelsCompleted * bonus);
            System.out.println("Your final score is " + finalScore + ".");
        }

        // zadanie, bez wykorzystania Metod
        if (gameOver) {
            score = 10000;
            levelsCompleted = 8;
            bonus = 200;
            int finalSecondScore = score + (levelsCompleted * bonus);
            System.out.println("Your second score is " + finalSecondScore + ".");
        }
    }
}
