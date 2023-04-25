public class StringCompare {
  public static void main(String[] args) {

    System.out.println(getSmallestAndLargest("welcometojava", 3));
    
  }

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);


    int iterations = s.length() - k;
    for (int i = 0; i <= iterations; i++) {
      if (largest.compareTo(s.substring(i, i + k)) < 0) {
        largest = s.substring(i, i + k);
      }
      if (smallest.compareTo(s.substring(i, i + k)) > 0) {
        smallest = s.substring(i, i + k);
      }
    }

    return smallest + "\n" + largest;
  }

}
