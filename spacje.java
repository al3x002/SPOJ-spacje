//al3x002
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tab = line.split(" ");
            for (int i = 0; i < tab.length; i++) {
                String x = tab[i];
                if (!x.isEmpty()) {
                    if (i == 0)
                        System.out.print(x);
                    else
                        System.out.print(x.substring(0, 1).toUpperCase() + x.substring(1));
                }
            }
            System.out.println();
        }
    }
}
