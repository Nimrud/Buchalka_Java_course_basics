package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class X_Main {
    public static void main(String[] args) {

        // Zadanie 29
        System.out.println("Zadanie 29:");
        X_exercise29_SimpleCalculator calculator = new X_exercise29_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
        System.out.println();

        // Zadanie 30
        System.out.println("Zadanie 30:");
        X_exercise30_Person person = new X_exercise30_Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
        System.out.println();

        // Zadanie Classes challenge
        System.out.println("Zadanie Classes_challenge:");
        // Wpisywanie danych bez użycia konstruktora:
        Classes_constructors_challenge customer1 = new Classes_constructors_challenge();
        customer1.setAccountNumber(1);
        System.out.println("Utworzono konto " + customer1.getAccountNumber());
        customer1.withdrawFunds(100);
        customer1.setCustomerName("Jan Kowalski");
        customer1.setEmail("jan_kowalski@op.pl");
        customer1.setPhoneNumber(618825752);
        customer1.setBalance(1000.00);
        System.out.println("Dane klienta nr " + customer1.getAccountNumber() + ":");
        System.out.println(customer1.getCustomerName() + ", e-mail: " + customer1.getEmail() + ", tel.: " + customer1.getPhoneNumber());
        System.out.println("Saldo: " + customer1.getBalance());
        customer1.depositFunds(1205.12);
        System.out.println("Saldo konta po zdeponowaniu środków: " + customer1.getBalance());
        customer1.withdrawFunds(3000);
        System.out.println(customer1.getBalance());

        System.out.println();

        // Wpisywanie danych z wykorzystaniem konstruktora
        Classes_constructors_challenge customer2 = new Classes_constructors_challenge(2, 0.0, "Marian Jackiewicz", "m_j@wp.pl", 254636882);
        customer2.withdrawFunds(100);
        System.out.println();

        // Classes_constructors_challenge
        System.out.println("VIP Customer challenge");
        Classes_constructors_challenge_VipCustomer vc1 = new Classes_constructors_challenge_VipCustomer();
        System.out.println("email: " + vc1.getEmail() +", name: " + vc1.getName() + ", limit: " + vc1.getLimit());

        Classes_constructors_challenge_VipCustomer vc2 = new Classes_constructors_challenge_VipCustomer("Marek", "marek@op.pl");
        System.out.println("email: " + vc2.getEmail() +", name: " + vc2.getName() + ", limit: " + vc2.getLimit());

        // Zadanie 31
        System.out.println("Zadanie 31: ");
        X_exercise31_Wall wall = new X_exercise31_Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        System.out.println();

        // Zadanie 32
        System.out.println("Zadanie 32:");
        X_exercise32_Point first = new X_exercise32_Point(6, 5);
        X_exercise32_Point second = new X_exercise32_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        X_exercise32_Point point = new X_exercise32_Point();
        System.out.println("distance()= " + point.distance());
        System.out.println();

        // Zadanie 33
        System.out.println("Zadanie 33:");
        X_exercise33b_Carpet carpet = new X_exercise33b_Carpet(3.5);
        X_exercise33a_Floor floor = new X_exercise33a_Floor(2.75, 4.0);
        X_exercise33c_Calculator calc = new X_exercise33c_Calculator(floor, carpet);
        System.out.println("total= " + calc.getTotalCost());
        carpet = new X_exercise33b_Carpet(1.5);
        floor = new X_exercise33a_Floor(5.4, 4.5);
        calc = new X_exercise33c_Calculator(floor, carpet);
        System.out.println("total= " + calc.getTotalCost());
        System.out.println();

        // Zadanie 34
        System.out.println("Zadanie 34:");
        X_exercise34_ComplexNumber one = new X_exercise34_ComplexNumber(1.0, 1.0);
        X_exercise34_ComplexNumber number = new X_exercise34_ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
        System.out.println();


    }
}
