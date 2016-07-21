import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        triangle.printAsterisk();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        triangle.drawHorizontalLine(Integer.parseInt(input));

        triangle.drawVerticalLine(Integer.parseInt(scanner.nextLine()));
    }

    private void drawVerticalLine(int number) {
        for (int i=0; i<number; i++) {
            System.out.println("*3");
        }
    }

    private void drawHorizontalLine(int number) {
        for (int i=0; i<number; i++) {
            System.out.print("*");
        }
    }

    public void printAsterisk() {
        System.out.print("*");
    }
};
