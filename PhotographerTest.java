import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  Camera camera;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

  @Before
  public void before() {
    photographer = new Photographer();
    camera = new Camera();
    analogueCamera = new AnalogueCamera("Sony", "ILCE5100l", "Lo");
    digitalCamera = new DigitalCamera("Nikon", "34T", "Hi");

  }
  
  @Test
    public void canAddCamera() {
    photographer.addCamera( camera );
    assertEquals(1, photographer.cameraCount()); 
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera( camera );
    photographer.removeCamera( camera );
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canPrintDigitalCameraDetails() {
    digitalCamera = new DigitalCamera("a", "b", "c");
    assertEquals("Make: a. Model: b. Resolution: c", digitalCamera.printDetails());
  }




}