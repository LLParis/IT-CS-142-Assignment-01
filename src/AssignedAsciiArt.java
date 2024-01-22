public class AssignedAsciiArt {
    static int SIZE = 4;
    public static void main(String[] args) {
        antenna();
        upperSaucer();
        lowerSaucer();
        antenna();
        tower();
        upperSaucer();
    }

    public static void antenna() {
        // rows
        for (int row = 0; row < SIZE; row++) {

            // spaces
            for (int space = 0; space  < 12; space++) {
                System.out.print(" ");
            }
            // chars
            System.out.print("||");
            System.out.println();
        }
    }

    public static void upperSaucer() {
        // rows
        for (int row = 0; row < SIZE; row++) {

            // spaces
            for (int space = 0; space < -3 * row + 9; space++) {
                System.out.print(" ");
            }

            // print __/
            System.out.print("__/");

            // print :
            for (int colon = 0; colon < 3 * row; colon++) {
                System.out.print(":");
            }

            // print ||
            System.out.print("||");

            // print :
            for (int colon = 0; colon < 3 * row; colon++) {
                System.out.print(":");
            }

            // print \\__
            System.out.print("\\__");

            // next line
            System.out.println();
        }

        // separator
        System.out.print("|");
        for (int i = 0; i < SIZE * 6; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void lowerSaucer() {
        // rows
        for (int row = 0; row < SIZE; row++) {
            // spaces
            for (int space = 0; space < row * 2; space++) {
                System.out.print(" ");
            }
            // print \\_
            System.out.print("\\_");

            // print /\\
            for (int mount = 0; mount < -2 * row + 11; mount ++) {
                System.out.print("/\\");
            }

            // print _/
            System.out.println("_/");
        }
    }

    public static void tower() {
        // rows
        for (int row = 0; row < SIZE * 3; row++) {
            // spaces
            for (int space = 0; space < 9; space++) {
                System.out.print(" ");
            }
            // print |%%||%%|
            System.out.print("|%%||%%|");

            // next line
            System.out.println();
        }
    }

}
