package pl.jaczewski.m12_collections.new_challenges.adventure_game;

/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // CHALLENGE
    // Implement the command() method in the Main class to allow players to type full words, or phrases,
    //then move to the correct location based upon their input.
    //
    //The player should be able to type commands such as "Go West", "run South", "I need to Quit this game"
    //or just "East" and the program will move to the appropriate location if there is one.
    //
    //The console should display its current location, then it should prompt the user with:
    //"Available exits are ", and its available exits. For example:
    //
    //You are standing at the end of a road before a small brick building
    //Available exits are Q, S, E, N, W,
    //
    //A move in a valid direction should print (keep in mind N, S, E and W variants - showing N below):
    //
    //You are standing at the end of a road before a small brick building
    //Available exits are Q, S, E, N, W,
    //
    //You are in the forest
    //Available exits are Q, S, W,
    //
    //An attempt to move in an invalid direction should print a message and remain in the same place.
    //The printed message should be: "You cannot go in that direction". For Example:
    //
    //You are standing at the end of a road before a small brick building
    //Available exits are Q, S, E, N, W,
    //
    //You cannot go in that direction
    //You are standing at the end of a road before a small brick building
    //Available exits are Q, S, E, N, W,
    //
    //Output for quit (Q) command should be displayed as:
    //
    //You are standing at the end of a road before a small brick building
    //Available exits are Q, S, E, N, W,
    //
    //You are sitting in front of a computer learning Java
    //
    //Single letter commands (N, W, S, E, Q) should still be available.
    //
    //TIP: Declare a Map called vocabulary as a field with private access modifier, the object is of type HashMap.
    //	Create its key-value pair in the constructor by using the put() method. Both key and value are of type String.
    //	Use vocabulary to store the original commands aliases (eg. NORTH = N, SOUTH = S, ...).
    //
    //TIP: Instantiate (create) the Scanner object inside the method.
    //
    //NOTE: Ignore "No line found" in the output if you get an error message. It is not the reason for the error.
    //	Instead, check spelling/spaces/format in the printed message.

    private Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }

    public void command() {
        // write code here
        Scanner scanner = new Scanner(System.in);

        int location = 1;

        while (true) {
            System.out.println(locations.get(location).getDescription());

            if (location == 0) {
                break;
            }

            Map<String, Integer> availableExits = locations.get(location).getExits();
            System.out.print("Available exits are ");
            for (String exit : availableExits.keySet()) {
                System.out.println(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toLowerCase();

            if (direction.matches(".*\\bnorth\\b.*") || direction.matches(".*\\bn\\b.*")) {
                direction = "N";
            } else if(direction.matches(".*\\beast\\b.*") || direction.matches(".*\\be\\b.*")) {
                direction = "E";
            } else if (direction.matches(".*\\bsouth\\b.*") || direction.matches(".*\\bs\\b.*")) {
                direction = "S";
            } else if (direction.matches(".*\\bwest\\b.*") || direction.matches(".*\\bw\\b.*")) {
                direction = "W";
            } else if (direction.matches(".*\\bquit\\b.*") || direction.matches(".*\\bq\\b.*")){
                direction = "Q";
            } else {
                direction = " ";
            }

            if (availableExits.containsKey(direction)) {
                location = availableExits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
        scanner.close();
    }
}
