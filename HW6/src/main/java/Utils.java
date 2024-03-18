import java.util.Arrays;

/**
 * The Utils class provides utility methods for handling and processing arrays.
 * It provides a method for comparing the averages of two arrays, and a method
 * for getting the average value in an array.
 *
 * @author Andriyanov Maksim
 * @version 1.0
 * @since 2024-03-18
 */
public class Utils {
  /**
   * The compareLists() method compares the average values of two arrays.
   * The method checks if the input is null or an empty array, and outputs an appropriate message.
   * The method then calculates the averages of the two arrays and outputs which one is greater,
   * or if they are equal.
   *
   * @param array1 the first array to be compared
   * @param array2 the second array to be compared
   */
  public void compareLists(final int[] array1, final int[] array2) {
    if (array1 == null || array2 == null) {
      System.out.println("Null is not allowed");
      return;
    }

    if (array1.length == 0 || array2.length == 0) {
      System.out.println("Empty array is not allowed");
      return;
    }

    double avg1 = getAvgInArray(array1);
    double avg2 = getAvgInArray(array2);

    if (avg1 == avg2) {
      System.out.println("Средние значения равны");
    } else if (avg1 > avg2) {
      System.out.println("Первый список имеет большее среднее значение");
    } else {
      System.out.println("Второй список имеет большее среднее значение");
    }
  }

  /**
   * The getAvgInArray() method calculates the average value in an array.
   * The method uses the Java Stream API to calculate the average.
   *
   * @param array the array for which to calculate the average
   * @return the average value of the array
   */
  private double getAvgInArray(final int[] array) {
    return Arrays.stream(array).average().getAsDouble();
  }
}
