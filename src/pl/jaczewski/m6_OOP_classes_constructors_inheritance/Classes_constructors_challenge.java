package pl.jaczewski.m6_OOP_classes_constructors_inheritance;

public class Classes_constructors_challenge {

    private int accountNumber;
    private double balance;   // zgodnie z dotychczasowym zaleceniem, do czasu wprowadzenia BigDecimala
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        if (deposit > 0){
            this.balance += deposit;
            System.out.println("Na koncie zdeponowano " + deposit + ".");
        } else {
            System.out.println("Nieprawidłowa wartość");
        }
    }

    public void withdrawFunds(double withdrawal){
        if (withdrawal <= this.balance) {
            this.balance -= withdrawal;
            System.out.println("Zostało wypłacone " + withdrawal + ".");
            System.out.println("Na koncie pozostało " + this.balance + ".");
        } else {
            System.out.println("Brak wystarczających środków na koncie.");
        }
    }

    // Tworzenie konstruktora
    public Classes_constructors_challenge(){
        // poniżej przywoływanie innego konstruktora wewnątrz tego konstruktora
        // za pomocą słowa kluczowego 'this'
        // Znaczenie: jeśli przywołujesz konstruktor bez parametrów, to zostaną użyte poniższe parametry
        this(4444, 0.00, "Domyślny Klient", "aaa@op.pl", 555000111);

        System.out.println("--- pusty konstruktor ---");
    }

    public Classes_constructors_challenge(int accountNumber, double balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Stworzono klienta z użyciem konstruktora");
    }

    public Classes_constructors_challenge(String customerName, String email, int phoneNumber) {
        // konstruktor, w którym nadajemy domyślną wartość tylko 2 parametrom
        // reszta zostaje przekazana przy wywołaniu konstruktora
        // DOBRA PRAKTYKA! - robimy główny konstruktor ze wszystkimi polami, a potem go wywołujemy (this)
        this(9999, 0.00, customerName, email, phoneNumber);
    }
}
