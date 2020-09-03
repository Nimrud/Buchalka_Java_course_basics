package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class Encapsulation_challenge_Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean isDuplex;
    private int sheetsOfPaper = 0;

    public int addToner(int value){
        System.out.println("Uzupełniono toner.");
        if (this.tonerLevel + value > 100){
            System.out.println("Toner napełniony w 100%");
            return this.tonerLevel = 100;
        } else {
            int newTonerLevel = this.tonerLevel += value;
            System.out.println("Toner napełniony w " + newTonerLevel + "%");
            return newTonerLevel;
        }
    }

    public int pagePrinting(int pages){
        if (isDuplex){
            System.out.println("Drukowanie " + pages + " stron.");
            double a = (double) this.pagesPrinted;
            this.sheetsOfPaper = (int) Math.ceil( (a += pages)/2 );
            System.out.println("Zużyto " + this.sheetsOfPaper + " kartek papieru.");
            return this.pagesPrinted += pages;
        } else {
            System.out.println("Drukowanie " + pages + " stron.");
            return this.pagesPrinted += pages;
        }
    }

    // Konstruktor
    public Encapsulation_challenge_Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > 100){
            System.out.println("Poziom toneru ustawiono na maksymalny poziom (100%).");
            this.tonerLevel = 100;
        } else if (tonerLevel < 0) {
            System.out.println("Poziom toneru ustawiono na minimalny poziom (0%).");
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }
}
