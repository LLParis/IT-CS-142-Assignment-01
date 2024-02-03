
import java.util.Scanner;

public class AssignedAsciiArt {
    static int SIZE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What size space needle would you like to see? ");
        SIZE = input.nextInt();
        input.close();

        needle();
        upperDisc();
        lowerDisc();
        needle();
        tower();
        upperDisc();
    }

    private static void needle() {
        for (int row = 0; row < SIZE; row++) {
            for (int space = 0; space < 3 * SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print("||");
            System.out.println();
        }
    }

    private static void upperDisc() {
        for (int row = 0; row < SIZE; row++) {
            for (int space = 0; space < 3 * SIZE - 3 * row - 3; space++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int colon = 0; colon < 3 * row; colon++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int colon = 0; colon < 3 * row; colon++) {
                System.out.print(":");
            }
            System.out.println("\\__");
        }
        System.out.print("|");
        for (int quote = 0; quote < 6 * SIZE; quote++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    private static void lowerDisc() {
        for (int row = 0; row < SIZE; row++) {
            for (int space = 0; space < 2 * row; space++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int mountain = 0; mountain < 3 * SIZE - 2 * row - 1; mountain++) {
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }

private static void tower() {
    double spaceFactor;
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

    double spaces = (SIZE * spaceFactor);

    for (int row = 0; row < SIZE * 3; row++) {
        for (int space = 0; space < spaces; space++) {
            System.out.print(" ");
        }

        System.out.print("|");
        // Dynamically print % chars based on size
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
        for (int i = 0; i < percentChars; i++) {
            System.out.print("%");
        }
        System.out.print("||");
        for (int i = 0; i < percentChars; i++) {
            System.out.print("%");
        }
        System.out.println("|");
    }
}

}
