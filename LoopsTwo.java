import java.util.*;

public class LoopsTwo {

  public static void main(String[] argh) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for (int i = 0; i < t; i++) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      int n = scan.nextInt();
      String outputLine = "";
      int resultA = a;

      for (int j = 0; j < n; j++) {
        int resultB = (int) Math.pow(2, j) * b;
        resultA += resultB;
        String print = Integer.toString(resultA);
        outputLine += print + " ";

      }
      System.out.println(outputLine);
    }
    scan.close();
  }
}
