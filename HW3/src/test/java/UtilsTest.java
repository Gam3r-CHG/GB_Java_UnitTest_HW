import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

  @Test
  void evenNumberTest() {
    assertTrue(Utils.evenOddNumber(2));
  }

  @Test
  void oddNumberTest() {
    assertFalse(Utils.evenOddNumber(3));
  }

  @Test
  void numberInIntervalTest() {
    assertTrue(Utils.numberInInterval(26));
  }

  @Test
  void numberInIntervalFalseTest() {
    assertFalse(Utils.numberInInterval(15));
  }
}