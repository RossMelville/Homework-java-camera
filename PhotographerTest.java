import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

  @Before
  public void before() {
    photographer = new Photographer();
    analogueCamera = new AnalogueCamera("Sony", "ILCE5100l", "Lo");
    digitalCamera = new DigitalCamera("Nikon", "34T", "Hi");

  }
  
  @Test
    public void canAddDigitalCamera() {
    photographer.addCamera( digitalCamera );
    assertEquals(1, photographer.cameraCount()); 
  }

  @Test
  public void canAddAnalogueCamera() {
    photographer.addCamera( analogueCamera );
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveDigitalCamera() {
    photographer.addCamera( digitalCamera );
    photographer.removeCamera( digitalCamera );
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canRemoveAnalogueCamera() {
    photographer.addCamera( analogueCamera );
    photographer.removeCamera( analogueCamera );
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canPrintDigitalCameraDetails() {
    digitalCamera = new DigitalCamera("a", "b", "c");
    assertEquals("Make: a. Model: b. Resolution: c", digitalCamera.printDetails());
  }

  @Test 
  public void canPrintAnalogueCameraDetails() {
      analogueCamera = new AnalogueCamera("a", "b", "c");
      assertEquals("Make: a. Model: b. Resolution: c", analogueCamera.printDetails());
  }




}