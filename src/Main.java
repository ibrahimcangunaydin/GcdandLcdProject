import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, gcd = 1, lcm = 0, smallOne, bigOne;

        Scanner inp = new Scanner(System.in);
        System.out.print("First number: ");
        n1 = inp.nextInt();
        System.out.print("Second number: ");
        n2 = inp.nextInt();

        if (n1 > n2) {
            smallOne = n2;
            bigOne = n1;
        } else {
            smallOne = n1;
            bigOne = n2;
        }

        while (smallOne >= 1) {
            if (n1 % smallOne == 0 && n2 % smallOne == 0) {
                gcd = smallOne;
                break;
            }
            smallOne--;
        }

        while (bigOne <= n1 * n2) {
            if (bigOne % n1 == 0 && bigOne % n2 == 0) {
                lcm = bigOne;
                break;
            }
            bigOne++;
        }

        System.out.println("The greatest common divisor: " + gcd);
        System.out.println("The least common multiple: " + lcm);
    }
}
