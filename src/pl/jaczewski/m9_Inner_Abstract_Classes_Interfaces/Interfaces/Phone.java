package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Interfaces;

public class Phone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    @Override
    public void powerOn() {

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+ phoneNumber);
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
        return false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("*beep*  *beep*");
        }
        return false;
    }
}
