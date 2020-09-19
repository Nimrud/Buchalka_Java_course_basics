package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Interfaces;

public class Main {
    public static void main(String[] args) {

        ITelephone myPhone;

        myPhone = new DesktopPhone(222333777);
        myPhone.powerOn();
        myPhone.callPhone(222333777);
        myPhone.answer();

        System.out.println("========");

        myPhone = new MobilePhone(645978312);
        myPhone.powerOn();
        myPhone.callPhone(645978312);
        myPhone.answer();
    }
}
