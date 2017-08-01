import java.util.*;

public class Photographer {

  private ArrayList<Camera> cameras;

  public Photographer() {
    this.cameras = new ArrayList<Camera>();
  }

  public int cameraCount() {
    return this.cameras.size();
  }

  public void addCamera( Camera camera ) {
    this.cameras.add( camera );
  }


}