import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The UtilsTests class is designed to test the methods of the Utils class.
 * <p>
 * This class contains tests for the compareLists() method of the Utils class.
 * The compareLists() method compares the average values of two input arrays.
 *
 * @author Andriyanov Maksim
 * @version 1.0
 * @since 2024-03-18
 */
public class UtilsTests {

  private Utils utils;
  private ByteArrayOutputStream byteArrayOutputStream;
  private PrintStream printStreamOld;

  /**
   * The setUp() method is executed before each test.
   * It sets up the output stream and initializes an instance of the Utils class.
   */
  @BeforeEach
  void setUp() {
    byteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(byteArrayOutputStream);
    printStreamOld = System.out;
    System.setOut(printStream);

    utils = new Utils();
  }

  /**
   * The tearDown() method is executed after each test.
   * It restores the standard output stream.
   */
  @AfterEach
  void tearDown() {
    System.out.flush();
    System.setOut(printStreamOld);
  }

  /**
   * The test checks the behavior of the compareLists() method when passing empty arrays.
   */
  @Test
  public void testEmptyArray() {
    utils.compareLists(new int[]{}, new int[]{});
    assertEquals("Empty array is not allowed\n", byteArrayOutputStream.toString());
  }

  /**
   * The test checks the behavior of the compareLists() method when passing null as input data.
   */
  @Test
  public void testNullInput() {
    utils.compareLists(null, null);
    assertEquals("Null is not allowed\n", byteArrayOutputStream.toString());
  }

  /**
   * The test checks the behavior of the compareLists() method when passing two identical arrays.
   */
  @Test
  public void testArrayEquals() {
    int[] arr1 = {1, 2, 3, 4, 5};

    utils.compareLists(arr1, arr1);
    assertEquals("Средние значения равны\n", byteArrayOutputStream.toString());
  }

  /**
   * The test checks the behavior of the compareLists() method in case the average value
   * of the first array is greater than the second one.
   */
  @Test
  public void testFistArrayAvgGreater() {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {2, 3, 4, 5, 6};

    utils.compareLists(arr2, arr1);
    assertEquals("Первый список имеет большее среднее значение\n", byteArrayOutputStream.toString());
  }

  /**
   * The test checks the behavior of the compareLists() method in case the average value
   * of the second array is greater than the first one.
   */
  @Test
  public void testSecondArrayAvgGreater() {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {2, 3, 4, 5, 6};

    utils.compareLists(arr1, arr2);
    assertEquals("Второй список имеет большее среднее значение\n", byteArrayOutputStream.toString());
  }
}
