import java.util.Scanner;

public class StringSplitTokens {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
    String[] tokenArray = s.trim().split("[^a-zA-Z]+");

    int tokenNum = 0;
    for (int i = 0; i < tokenArray.length; i++) {
      if (tokenArray[i].length() > 0) {
        tokenNum++;
      }
    }

    System.out.println(tokenNum);

    for (int j = 0; j < tokenArray.length; j++) {
      if (tokenArray[j].length() > 0) {
        System.out.println(tokenArray[j]);
      }
    }

    scan.close();
  }
}
