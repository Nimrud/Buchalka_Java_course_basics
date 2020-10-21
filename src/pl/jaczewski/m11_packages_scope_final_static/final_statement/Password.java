package pl.jaczewski.m11_packages_scope_final_static.final_statement;

public class Password {
    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
        // ^ to XOR ("exclusive OR"), czyli funkcja alternatywy rozłącznej
        // jest wykonywana na bitach!!!
        // https://stackoverflow.com/questions/14526584/what-does-the-xor-operator-do
    }

    public final void storePassword() {
        // słowo final zapobiega nadpisaniu metody przez inną klasę
        // ("NewPassword extends Password" -> Override Method)
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
