import static java.lang.StringTemplate.STR;

public abstract class Vehicle {
  public String company;
  public String model;
  public int yearRelease;
  public int numWheels;
  public int speed;

  public Vehicle(String company, String model, int yearRelease, int numWheels, int speed) {
    this.company = company;
    this.model = model;
    this.yearRelease = yearRelease;
    this.numWheels = numWheels;
    this.speed = speed;
  }

  public abstract void testDrive();
  public abstract void park();

  @Override
  public String toString() {
    return STR."\{this.company} \{this.model} (\{this.yearRelease}): Wheels - \{this.numWheels} Speed - \{this.speed}";
  }
}
