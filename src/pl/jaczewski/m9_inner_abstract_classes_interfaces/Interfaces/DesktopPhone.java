package pl.jaczewski.m9_inner_abstract_classes_interfaces.Interfaces;

public class DesktopPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DesktopPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("This phone is always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering phone");
            isRinging = false;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("*beep*  *beep*");
        } else {
            isRinging = false;
        }
        return isRinging;
    }
}
