import java.util.Scanner;

public class StringReverse {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    
    StringBuilder reverse = new StringBuilder("");
    for (int i = 0; i <= A.length() - 1; i++) {
      reverse.append(A.charAt(A.length() - 1 - i));
    }

    if (reverse.toString().equals(A)) {
     System.out.println("Yes");;
    } else {
      System.out.println("No");
    }

    sc.close();
    
  }
}
