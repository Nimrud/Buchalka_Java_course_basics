package pl.jaczewski.m12_collections.maps_adventure_game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Based on a classic adventure game: Colossal Cave Adventure
public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        // Challenge:
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        // aby zobaczyć schemat poruszania się po lokacjach - spójrz na plik Locations_map.png
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        //locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
        //locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        //locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        //locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        //locations.get(5).addExit("Q", 0);
        // Q (wyjście) pojawia się w każdej lokacji, więc lepiej umieścić je w konstruktorze klasy Location

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits: ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            System.out.print("Your choice: ");

            String direction = scanner.nextLine().toLowerCase();

            //Challenge:

            // pierwsze podejście (działające, ale z powtarzającym się kodem):

            /*
            if (direction.matches(".*\\beast\\b.*") || direction.matches(".*\\be\\b.*")) {
                if (exits.containsKey("E")) {
                    loc = exits.get("E");
                } else {
                    System.out.println("You cannot go in this direction!");
                }
            } else if (direction.matches(".*\\bwest\\b.*") || direction.matches(".*\\bw\\b.*")) {
                if (exits.containsKey("W")) {
                    loc = exits.get("W");
                } else {
                    System.out.println("You cannot go in this direction!");
                }
            } else if (direction.matches(".*\\bnorth\\b.*") || direction.matches(".*\\bn\\b.*")) {
                if (exits.containsKey("N")) {
                    loc = exits.get("N");
                } else {
                    System.out.println("You cannot go in this direction!");
                }
            } else if (direction.matches(".*\\bsouth\\b.*") || direction.matches(".*\\bs\\b.*")) {
                if (exits.containsKey("S")) {
                    loc = exits.get("S");
                } else {
                    System.out.println("You cannot go in this direction!");
                }
            } else if (direction.matches(".*\\bquit\\b.*") || direction.matches(".*\\bq\\b.*")) {
                if (exits.containsKey("Q")) {
                    loc = exits.get("Q");
                } else {
                    System.out.println("You cannot go in this direction!");
                }
            } else {
                System.out.println("No valid direction found");
            }

             */

            if (exits.containsKey(extractDirection(direction))){
                loc = exits.get(extractDirection(direction));
            } else {
                System.out.println("You cannot go in this direction!");
            }
        }
    }

    public static String extractDirection(String input) {
        // Gdy szukamy stringa w stringu:
        // .*  -> 0 lub więcej dowolnych znaków [przykład: ".*BREAK.*"] (ale to wykryje też dłuższe słowo, np. "BREAKFAST"!)
        // jeśli chcemy wykryć dokładnie dane słowo, to trzeba to opakować w \\b [przykład: ".*\\bBREAK\\b.*"]
        // warto na samym początku zamienić stringa za pomocą .toLowerCase
        if (input.matches(".*\\beast\\b.*") || input.matches(".*\\be\\b.*")) {
            return "E";
        } else if (input.matches(".*\\bwest\\b.*") || input.matches(".*\\bw\\b.*")) {
            return "W";
        } else if (input.matches(".*\\bnorth\\b.*") || input.matches(".*\\bn\\b.*")) {
            return "N";
        } else if (input.matches(".*\\bsouth\\b.*") || input.matches(".*\\bs\\b.*")) {
            return "S";
        } else if (input.matches(".*\\bquit\\b.*") || input.matches(".*\\bq\\b.*")) {
            return "Q";
        } else {
            return " ";
        }
    }
}
