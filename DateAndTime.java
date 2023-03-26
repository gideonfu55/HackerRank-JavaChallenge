import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class DateAndTime {
  // Problem URL:
  // https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true

  class Result {

    public static String findDay(int month, int day, int year) {

      Calendar cal = Calendar.getInstance();

      cal.set(Calendar.MONTH, month - 1);
      cal.set(Calendar.DAY_OF_MONTH, day);
      cal.set(Calendar.YEAR, year);

      String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
      
      return dayOfWeek;

    }

  }

  class Result2 {

    public static String findDay(int month, int day, int year) {

      LocalDate date = LocalDate.of(year, month, day);
      return date.getDayOfWeek().name();

    }
    
  }

  public static void main(String[] args) throws IOException {

    String res = Result2.findDay(8, 5, 2015);

    System.out.println(res);
  }

}
