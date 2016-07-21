import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> factors = PrimeFactors.generate(Integer.parseInt(scanner.nextLine()));
        System.out.print(factors);
    }

    private static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i=2; i<=number; i++) {
            int j=0;
            for (; j<factors.size(); j++) {
                if (i% factors.get(j) ==0){
                    break;
                }
            }
            if (j == factors.size()) {
                factors.add(i);
            }
        }

        return factors;
    }
}
