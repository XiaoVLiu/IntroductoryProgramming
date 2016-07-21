import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Diamond.drawIsoscelesDiamond(Integer.parseInt(scanner.nextLine()));
    }

    private static void drawIsoscelesDiamond(int number) {
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
