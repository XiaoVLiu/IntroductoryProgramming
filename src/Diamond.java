import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Diamond.drawIsoscelesTriangle(Integer.parseInt(scanner.nextLine()));
        Diamond.drawDiamond(Integer.parseInt(scanner.nextLine()));
        Diamond.drawDiamondWithName(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
    }

    private static void drawDiamondWithName(int number, String name) {
        for (int i=0; i<number-1; i++) {
            for (int j=0; j<number-i-1; j++) {
                System.out.print(" ");
            }

            for (int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println(name);
        drawDownTriangle(number);
    }

    private static void drawDiamond(int number) {
        drawIsoscelesTriangle(number);
        drawDownTriangle(number);
    }

    private static void drawDownTriangle(int number) {
        for (int i=1; i<number; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }

            for (int k=0; k<2*(number-i)-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void drawIsoscelesTriangle(int number) {
        for (int i=0; i<number; i++) {
            for (int j=0; j<number-i-1; j++) {
                System.out.print(" ");
            }

            for (int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
