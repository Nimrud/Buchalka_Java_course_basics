package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class Main {
    public static void main(String[] args) {

        // Composition challenge
        System.out.println("Composition challenge:");
        Composition_challenge_chair chair1 = new Composition_challenge_chair(80, 80, 100);
        Composition_challenge_table table1 = new Composition_challenge_table(6, 300, 150, 100);
        Composition_challenge_painting painting1 = new Composition_challenge_painting("El Greco", "View of Toledo", 1000000);
        Composition_challenge_Room livingRoom = new Composition_challenge_Room(chair1, chair1, chair1, table1, painting1);
        System.out.println("This is a table for " + livingRoom.getTable().getNumberOfSeats() + " people.");
        livingRoom.painting.displayPainting();
        livingRoom.painting.stealPainting();
        System.out.println();

        // Encapsulation challenge
        System.out.println("Encapsulation challenge:");
        Encapsulation_challenge_Printer printer = new Encapsulation_challenge_Printer(-10, true);
        System.out.println(printer.isDuplex());
        System.out.println(printer.getTonerLevel());
        printer.addToner(25);
        printer.pagePrinting(11);
        System.out.println();

        // OOP Grand Challenge
        System.out.println("OOP Grand Challenge:");
        OOP_challenge_Burger burger1 = new OOP_challenge_Burger("white", "My");
        burger1.addIngredient("lettuce");
        burger1.addIngredient("tomato");
        burger1.addIngredient("pepper");
        burger1.addIngredient("olives");
        burger1.addIngredient("cucumber");
        burger1.totalOrder();
        System.out.println();

        OOP_challenge_Burger_Healthy healthyBurger = new OOP_challenge_Burger_Healthy();
        healthyBurger.addIngredient("asparagus");
        healthyBurger.addIngredient("lettuce");
        healthyBurger.addIngredient("tomato");
        healthyBurger.addIngredient("pepper");
        healthyBurger.addIngredient("olives");
        healthyBurger.addIngredient("cucumber");
        healthyBurger.addIngredient("onion");
        healthyBurger.totalOrder();
        healthyBurger.priceCalculationScheme();
        System.out.println();

        OOP_challenge_Burger_Deluxe deluxeBurger = new OOP_challenge_Burger_Deluxe("dark");
        deluxeBurger.addIngredient("lettuce");
        deluxeBurger.addIngredient("tomato");
        deluxeBurger.addIngredient("pepper");
        deluxeBurger.addIngredient("olives");
        deluxeBurger.addIngredient("onion");
        deluxeBurger.totalOrder();
        deluxeBurger.priceCalculationScheme();

    }
}
