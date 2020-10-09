package pl.jaczewski.m9_inner_abstract_classes_interfaces.Interfaces;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean isRinging();
    boolean callPhone(int phoneNumber);
}
