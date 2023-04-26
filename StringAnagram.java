public class StringAnagram {
  public static void main(String[] args) {

    System.out.println(anagramOrNot(isAnagram("anagram", "margana")));
    System.out.println(anagramOrNot(isAnagram("anagramm", "marganaa")));
    System.out.println(anagramOrNot(isAnagram("Hello", "hello")));
    System.out.println(anagramOrNot(isAnagram("Hello", "ello")));
    System.out.println(anagramOrNot(isAnagram("JavaChampion", "chainjavapom")));
    System.out.println(anagramOrNot(isAnagram("abcdbcda", "bbccddaaxyz")));
    System.out.println(anagramOrNot(isAnagram("ab", "abXY")));
    
  }

  static boolean isAnagram(String a, String b) {

    if (a.length() != b.length()) {
      return false;
    }

    char[] arrayA= a.toLowerCase().toCharArray();
    char[] arrayB = b.toLowerCase().toCharArray();
    
    // Complete the function
    for (int i = 0; i <= a.length() - 1; i++) {
      int countA = 0;
      int countB = 0;
      for (char charA : arrayA) {
        if (charA == a.toLowerCase().charAt(i)) {
          countA++;
        }
      }

      for (char charB : arrayB) {
        if (charB == a.toLowerCase().charAt(i)) {
          countB++;
        }
      }

      if (countA != countB) {
        return false;
      }
    }

    return true;
  }

  static String anagramOrNot(boolean result) {
    if (result == true) {
      return "Anagrams";
    } else {
      return "Not Anagrams";
    }

  }

}
