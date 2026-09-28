//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {

            Scanner roy = new Scanner(System.in);

            System.out.print("Ingrese la altura del triángulo: ");
            int n = roy.nextInt();

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            roy.close();
        }
