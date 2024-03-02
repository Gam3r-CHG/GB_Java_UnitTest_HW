import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
  @Test
  void calculateDiscountTest() {
    assertThat(Calculator.calculateDiscount(100, 10)).isEqualTo(90.0);
    assertThat(Calculator.calculateDiscount(100, 25)).isEqualTo(75.0);
    assertThat(Calculator.calculateDiscount(100, 50)).isEqualTo(50.0);

    assertThatThrownBy(() -> Calculator.calculateDiscount(100, 100))
        .isInstanceOf(ArithmeticException.class);
    assertThatThrownBy(() -> Calculator.calculateDiscount(100, -1))
        .isInstanceOf(ArithmeticException.class);
    assertThatThrownBy(() -> Calculator.calculateDiscount(0, 25))
        .isInstanceOf(ArithmeticException.class);
  }
}
