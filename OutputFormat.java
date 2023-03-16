/**
 * Challenge: Java Output Format
 * 
 * Input Format
 * 
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of alphabetic characters, and each integer
 * will be in the inclusive range from to .
 * 
 * Output Format
 * 
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly
 * characters.
 * The second column contains the integer, expressed in exactly digits; if the
 * original input has less than three digits, you must pad your output's leading
 * digits with zeroes.
 * 
 * Sample Input:
 * 
 * java 100
 * cpp 65
 * python 50
 * 
 * Sample Output:
 * 
 * ================================
 * java 100
 * cpp 065
 * python 050
 * ================================
 */

import java.util.Scanner;

public class OutputFormat {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("================================");
    for (int i = 0; i < 3; i++) {
      String s1 = scan.next();

      while (s1.length() < 15) {
        s1 += " ";
      }

      int x = scan.nextInt();
      String y = Integer.toString(x);
      while (y.length() < 3) {
        y = "0" + y;
      }

      System.out.println(s1 + y);
    }
    System.out.println("================================");
    scan.close();
  }
}
