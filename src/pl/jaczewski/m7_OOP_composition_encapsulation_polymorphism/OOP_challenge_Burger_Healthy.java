package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class OOP_challenge_Burger_Healthy extends OOP_challenge_Burger{
    private String addition5;
    private String addition6;

    public OOP_challenge_Burger_Healthy() {
        super("brown rye", "Healthy");
    }

    @Override
    public int addIngredient(String addition) {
        if (this.numberOfAdditions >= 6){
            System.out.println("You cannot add more than 6 additions to the " + super.name + " Burger.");
            return this.numberOfAdditions;
        } else if (this.numberOfAdditions == 0){
            this.addition1 = addition;
        } else if (this.numberOfAdditions == 1){
            this.addition2 = addition;
        } else if (this.numberOfAdditions == 2){
            this.addition3 = addition;
        } else if (this.numberOfAdditions == 3){
            this.addition4 = addition;
        } else if (this.numberOfAdditions == 4){
            this.addition5 = addition;
        } else {
            this.addition6 = addition;
        }
        System.out.println("Added " + addition);
        return this.numberOfAdditions++;
    }

    @Override
    public void totalOrder() {
        if (numberOfAdditions == 0){
            System.out.println("Your order: " + name + " Burger without additions." + "\n" + "Total price: " + calculatePrice());
        } else if (numberOfAdditions == 1){
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " addition: " + addition1 + "."
                    + "\n" + "Total price: " + calculatePrice());
        } else if (numberOfAdditions == 2){
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " additions: " + addition1 + " and " + addition2 + "."
                    + "\n" + "Total price: " + calculatePrice());
        } else if (numberOfAdditions == 3){
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " additions: " + addition1 + ", " + addition2 + " and " + addition3 + "."
                    + "\n" + "Total price: " + calculatePrice());
        } else if (numberOfAdditions == 4){
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " additions: " + addition1 + ", " + addition2 + ", " + addition3 + " and " + addition4 + "."
                    + "\n" + "Total price: " + calculatePrice());
        } else if (numberOfAdditions == 5){
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " additions: " + addition1 + ", " + addition2 + ", " + addition3 + ", " + addition4
                    + " and " + addition5 + "."
                    + "\n" + "Total price: " + calculatePrice());
        } else {
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " additions: " + addition1 + ", " + addition2 + ", " + addition3 + ", " + addition4
                    + ", " + addition5 + " and " + addition6 + "."
                    + "\n" + "Total price: " + calculatePrice());
        }
    }

    public String getAddition5() {
        return addition5;
    }

    public String getAddition6() {
        return addition6;
    }
}
