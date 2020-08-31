package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class Classes_constructors_challenge_VipCustomer {

    private String name;
    private double limit;
    private String email;

    public Classes_constructors_challenge_VipCustomer() {
        this("Default Customer", 100.00, "email@email.com");
    }

    public Classes_constructors_challenge_VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public Classes_constructors_challenge_VipCustomer(String name, String email) {
        this(name, 200.00, email);
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.