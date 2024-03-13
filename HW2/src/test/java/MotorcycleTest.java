import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MotorcycleTest {

  private Motorcycle motorcycle;

  @BeforeEach
  public void setUp() {
    motorcycle = new Motorcycle("Honda", "CBR600", 2020);
  }

  /**
   * Проверить, что объект Motorcycle создается с 2-мя колесами.
   */
  @Test
  public void numberOfWheelsTest() {
    assertThat(motorcycle.numWheels).isEqualTo(2);
  }

  /**
   * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
   * (используя метод testDrive()).
   */
  @Test
  public void testDriveSpeedTest() {
    motorcycle.testDrive();
    assertThat(motorcycle.speed).isEqualTo(75);
  }

  /**
   * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
   * мотоцикл останавливается (speed = 0).
   */
  @Test
  public void parkSpeedTest() {
    motorcycle.testDrive();
    motorcycle.park();
    assertThat(motorcycle.speed).isEqualTo(0);
  }
}
