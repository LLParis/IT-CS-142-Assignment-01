public class FreeFormAsciiArt {

    public static void main(String[] args) {
        drawRoof();
        drawBody();
        drawDoor();
        drawWindow();
    }
    public static void drawRoof() {
        for (int i = 0; i < 7; i++) {
            // Print spaces
            for (int j = 0; j < 7 - i; j++) {
                System.out.print(" ");
            }
            // Print the roof
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawBody() {
        for (int i = 0; i < 6; i++) {
            System.out.println("   *******");
        }
    }

    public static void drawDoor() {
        System.out.println("   *  *  *");
        System.out.println("   *  *  *");
        System.out.println("   *******");
    }

    public static void drawWindow() {
        System.out.println("      **  ");
        System.out.println("      **  ");
    }
    
}
