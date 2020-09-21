package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Inner_Classes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Button button = new Button("Number 1");

    public static void main(String[] args) {
        //anonymous class - klasa bez nazwy:
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was typed in.");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        System.out.println("Press 1 to test, 0 to quit.");
        while (!quit){
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 0:
                    quit = true;
                    break;
                case 1:
                    button.onClick();
                    break;
            }
        }
    }
}
