public class DigitalCamera implements Printable{

  private String make;
  private String model;
  private String resolution;

  public DigitalCamera(String make, String model, String resolution) {
    this.make = make;
    this.model = model;
    this.resolution = resolution;
  }

  public String printDetails() {
    return "Digital";
  }

}