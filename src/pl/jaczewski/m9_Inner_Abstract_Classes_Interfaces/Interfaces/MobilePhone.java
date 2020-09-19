package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Interfaces;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Switching on mobile phone");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
            System.out.println("Now ringing " + phoneNumber);
        } else {
            System.out.println("Power off, cannot dial");
        }
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("*beep*  *beep*  *beep*");
        } else {
            isRinging = false;
        }
        return isRinging;
    }
}
