public class Start {
  public static void main(String[] args) {
    Car car = new Car("Mazda", "RX7", 2000);
    Motorcycle motorcycle = new Motorcycle("Honda", "CBR600", 2020);

    System.out.println(car);
    System.out.println(motorcycle);

    car.testDrive();
    motorcycle.testDrive();

    System.out.println(car);
    System.out.println(motorcycle);

    car.park();
    motorcycle.park();

    System.out.println(car);
    System.out.println(motorcycle);
  }
}
