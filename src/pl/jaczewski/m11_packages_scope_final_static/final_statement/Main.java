package pl.jaczewski.m11_packages_scope_final_static.final_statement;

public class Main {
    public static void main(String[] args) {
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);
    }
}
