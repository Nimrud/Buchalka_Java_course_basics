package pl.jaczewski.m7_OOP_composition_encapsulation_polymorphism;

public class OOP_challenge_Burger_Deluxe extends OOP_challenge_Burger{
    private String extra1;
    private String extra2;

    public OOP_challenge_Burger_Deluxe(String breadType) {
        super(breadType, "Deluxe");
        this.extra1 = "chips";
        this.extra2 = "drink";
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + additionPrice * 2;
    }

    @Override
    public void totalOrder() {
        if (numberOfAdditions == 0){
            System.out.println("Your order: " + name + " Burger plus " + extra1 + " and " + extra2 + "."
                    + "\n" + "Total price: " + calculatePrice());
        } else if (numberOfAdditions == 1){
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " addition: " + addition1
                    + " plus " + extra1 + " and " + extra2 + "."
                    + "\n" + "Total price: " + calculatePrice());
        } else if (numberOfAdditions == 2){
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " additions: " + addition1 + " and " + addition2
                    + " plus " + extra1 + " and " + extra2 + "."
                    + "\n" + "Total price: " + calculatePrice());
        } else if (numberOfAdditions == 3){
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " additions: " + addition1 + ", " + addition2 + " and " + addition3
                    + " plus " + extra1 + " and " + extra2 + "."
                    + "\n" + "Total price: " + calculatePrice());
        } else {
            System.out.println("Your order: " + name + " Burger with " + numberOfAdditions + " additions: " + addition1 + ", " + addition2 + ", " + addition3 + " and " + addition4
                    + " plus " + extra1 + " and " + extra2 + "."
                    + "\n" + "Total price: " + calculatePrice());
        }
    }

    public String getExtra1() {
        return extra1;
    }

    public String getExtra2() {
        return extra2;
    }
}
