import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        triangle.printAsterisk();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        triangle.drawHorizontalLine(Integer.parseInt(input));

        triangle.drawVerticalLine(Integer.parseInt(scanner.nextLine()));
        triangle.drawRightTriangle(Integer.parseInt(scanner.nextLine()));
    }

    private void drawRightTriangle(int number) {
        for (int i=1; i<=number; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void drawVerticalLine(int number) {
        for (int i=0; i<number; i++) {
            System.out.println("*");
        }
    }

    private void drawHorizontalLine(int number) {
        for (int i=0; i<number; i++) {
            System.out.print("*");
        }
    }

    private void printAsterisk() {
        System.out.print("*");
    }
}