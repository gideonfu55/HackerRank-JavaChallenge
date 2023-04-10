import java.util.Scanner;

public class JavaStringsIntro {
  public static void main(String[] args) {
    // Problem URL: https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

    /**
     * This exercise is to test your understanding of Java Strings.
     * 
     * The first line contains a string . The second line contains another string
     * The strings are comprised of only lowercase English letters.
     * 
     * Output Format
     * 
     * There are three lines of output:
     * For the first line, sum the lengths of A and B.
     * For the second line, write Yes if A is lexicographically larger than B or No
     * if it is not.
     * For the third line, capitalize the first letter in both A and B and print
     * them on a single
     * line, separated by a space.
     * 
     * Sample Input
     * 
     * //hello
     * //java
     * 
     * Sample Output
     * 9
     * No
     * Hello Java
     * 
     * Explanation
     * 
     * String A is "hello" and B is "java".
     * 
     * A has a length of , and B has a length of ; the sum of their lengths is 9.
     * When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, Ais not B
     * greater than and the answer is No.
     * 
     * When you capitalize the first letter of both A and B and then print them separated by a 
     * space, you get "Hello Java".
     *
     */

    Scanner scan = new Scanner(System.in);
    String A = scan.next();
    String B = scan.next();
    System.out.println("/n");
    /* Enter your code here. Print output to STDOUT. */
    // Operation 1:
    System.out.println(A.length() + B.length());

    // Operation 2:
    if (A.compareTo(B) > 0) {
      System.out.println("Yes");
      System.out.println(Character.toUpperCase(B.charAt(0)) + B.substring(1) + " " + Character.toUpperCase(A.charAt(0))
          + A.substring(1));
    } else {
      System.out.println("No");
      System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0))
          + B.substring(1));
    }

    scan.close();

  }
}
