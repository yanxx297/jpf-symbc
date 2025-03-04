package svcomp.StaticCharMethods05;/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StaticCharMethods05
 * The benchmark was taken from the repo: 24 January 2018
 */
import java.util.Scanner;
import org.sosy_lab.sv_benchmarks.Verifier;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(Verifier.nondetString());

    int radix = scanner.nextInt();

    int choice = scanner.nextInt() % 3;
    assert choice >= 0 && choice < 3;

    switch (choice) {
      case 1: // convert digit to character
        System.out.println("Enter a digit:");
        int digit = scanner.nextInt();
        System.out.printf("Convert digit to character: %s\n", Character.forDigit(digit, radix));
        char tmp = Character.forDigit(digit, radix);
        assert tmp == 't';
        break;

      case 2: // convert character to digit
        System.out.println("Enter a character:");
        char character = scanner.next().charAt(0);
        System.out.printf("Convert character to digit: %s\n", Character.digit(character, radix));
        break;
    }
  }
}
