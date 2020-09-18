package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Interfaces;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean isRinging();
    boolean callPhone(int phoneNumber);
}
