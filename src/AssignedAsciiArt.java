import java.util.Scanner;

public class AssignedAsciiArt {
    static int SIZE; // global variable to store size

    public static void main(String[] args) {
        // Scanning for user input
        Scanner input = new Scanner(System.in);
        System.out.print("What size space needle would you like to see? ");
        SIZE = input.nextInt();
        input.close(); // close scanner to preserve resources

        // ASCII art in modular format
        needle();
        upperDisc();
        lowerDisc();
        needle();
        tower();
        upperDisc();
    }
    // method to draw the needle of the Space Needle
    private static void needle() {
        // Loop to draw the needle part of the Space Needle
        for (int row = 0; row < SIZE; row++) {
            for (int space = 0; space < 3 * SIZE; space++) {
                System.out.print(" "); // printing spaces for alignment
            }
            System.out.print("||"); // printing the needle
            System.out.println();
        }
    }
    // method to draw the upper disc of the Space Needle
    private static void upperDisc() {
        // loop to handle rows
        for (int row = 0; row < SIZE; row++) {
            // loop to handle leading spaces
            for (int space = 0; space < 3 * SIZE - 3 * row - 3; space++) {
                System.out.print(" ");
            }
            System.out.print("__/"); // fencepost
            for (int colon = 0; colon < 3 * row; colon++) {
                System.out.print(":"); // printing left center
            }
            System.out.print("||"); // print divider
            for (int colon = 0; colon < 3 * row; colon++) {
                System.out.print(":"); // printing right center
            }
            System.out.println("\\__"); // fencepost
        }
        // printing section divider / belt line
        System.out.print("|"); // fencepost
        for (int quote = 0; quote < 6 * SIZE; quote++) {
            System.out.print("\""); // belt
        }
        System.out.println("|"); // fencepost
    }

    // Method to draw lower disc of the Space Needle
    private static void lowerDisc() {
        // printing rows of lower disc based on size
        for (int row = 0; row < SIZE; row++) {
            // cascading amount of leading spaces
            for (int space = 0; space < 2 * row; space++) {
                System.out.print(" ");
            }
            System.out.print("\\_"); // fencepost
            // printing center of lower disc
            for (int mountain = 0; mountain < 3 * SIZE - 2 * row - 1; mountain++) {
                System.out.print("/\\");
            }
            System.out.println("_/"); // fencepost
        }
    }
   // Method to draw tower part of the Space Needle
private static void tower() {
        // Calculate the space necessary to keep tower aligned
    double spaceFactor;
    // dynamically adjusting spaces based on size
    if (SIZE < 2) {
        spaceFactor = 1.5;
    } else if (SIZE <= 4) {
        spaceFactor = 2.2;
    } else if (SIZE < 6) {
        spaceFactor = 1.8;
    } else if (SIZE < 7) {
        spaceFactor = 2.0;
    } else {
        spaceFactor = 2.1;
    }
    // number of spaces needed before tower pattern
    double spaces = (SIZE * spaceFactor);
    // tower rows
    for (int row = 0; row < SIZE * 3; row++) {
        // leading spaces for alignment
        for (int space = 0; space < spaces; space++) {
            System.out.print(" ");
        }

        System.out.print("|"); // fencepost
        // Dynamically calculate number of % chars based on size
        int percentChars = 0;
        if (SIZE <= 2) {
            percentChars = 0;
        } else if (SIZE <= 3) {
            percentChars = 1;
        } else if (SIZE <= 4) {
            percentChars = 2;
        } else if (SIZE <= 7) {
            percentChars = 5;
        } else {
            percentChars = 8;
        }
        // printing % chars on the left side of the tower
        for (int i = 0; i < percentChars; i++) {
            System.out.print("%");
        }
        System.out.print("||");
        // printing % chars on the right side of the tower
        for (int i = 0; i < percentChars; i++) {
            System.out.print("%");
        }
        System.out.println("|");// fencepost
    }
}

}
