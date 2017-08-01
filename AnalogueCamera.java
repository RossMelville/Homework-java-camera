public class AnalogueCamera implements Printable{

  private String make;
  private String model;
  private String resolution;

  public AnalogueCamera(String make, String model, String resolution) {
    this.make = make;
    this.model = model;
    this.resolution = resolution;
  }

  public String printDetails() {
    return "a";
  }

}