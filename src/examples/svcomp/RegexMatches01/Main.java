package svcomp.RegexMatches01;/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/RegexMatches01
 * The benchmark was taken from the repo: 24 January 2018
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Pattern expression = Pattern.compile("W.*\\d[0-35-9]-\\d\\d-\\d\\d");

    String string1 =
        "XXXX's Birthday is 05-12-75\n"
            + "YYYY's Birthday is 11-04-68\n"
            + "ZZZZ's Birthday is 04-28-73\n"
            + "WWWW's Birthday is 12-17-77";

    Matcher matcher = expression.matcher(string1);

    while (matcher.find()) {
      System.out.println(matcher.group());
      String tmp = matcher.group();
      assert tmp.equals("WWWW's Birthday is 12-17-77");
    }
  }
}
