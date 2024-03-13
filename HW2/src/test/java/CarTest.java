import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

  private Car car;

  @BeforeEach
  public void setUp() {
    car = new Car("Mazda", "RX7", 2000);
  }

  /**
   * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
   * (используя оператор instanceof).
   */
  @Test
  public void instanceOfVehicleTest() {
    assertThat(car).isInstanceOf(Vehicle.class);
  }

  /**
   * Проверить, что объект Car создается с 4-мя колесами.
   */
  @Test
  public void numberOfWheelsTest() {
    assertThat(car.numWheels).isEqualTo(4);
  }

  /**
   * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
   * (используя метод testDrive()).
   */
  @Test
  public void testDriveSpeedTest() {
    car.testDrive();
    assertThat(car.speed).isEqualTo(60);
  }

  /**
   * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
   * машина останавливается (speed = 0).
   */
  @Test
  public void parkSpeedTest() {
    car.testDrive();
    car.park();
    assertThat(car.speed).isEqualTo(0);
  }
}
