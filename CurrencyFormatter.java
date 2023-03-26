// Problem URL: https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    // Write your solution code block here.
    Locale INDIA = new Locale("en", "IN"); // Creates a new Locale with English as the language and India as the country

    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }

}
