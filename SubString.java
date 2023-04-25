import java.util.Scanner;

/**
 * Challenge URL:
 * https://www.hackerrank.com/challenges/java-substring/problem?h_r=next-challenge&h_v=zen&isFullScreen=true
 * Given a string, S, and two indices, start and end, print a substring consisting of all characters in the inclusive range from
 * start to end - 1. You'll find the String class' substring method helpful in completing this challenge.
 * 
 * Sample Input:
 * 
 * Helloworld
 * 3 7
 * Sample Output
 * lowo
 * 
 */

public class SubString {
  
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
    String split = S.substring(start, end);
    System.out.println(split);
    
    in.close();
  }
}
