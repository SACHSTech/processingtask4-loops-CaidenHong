import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    strokeWeight((float)0.0019*height);
    stroke(0, 0, 0);

    // Quadrant 2 Grid
    for (int i = height/20; i <= height/2; i += height/20) {
      line(i, 0, i, height/2);
      line(0, i, width/2, i);
    }

    // Quadrant 1 Circles
    fill(50, 168, 82);
    for (int circleY = ((height)/14); circleY <= ((height/14)*7); circleY += ((height)/11)) {
      for (int circleX = ((width)/14)+250; circleX <= ((width/14)*7)+250; circleX += ((width)/11)) {
        ellipse(circleX, circleY, 25, 25);
      }
    }

    // Quadrant 3 Gradient
    strokeWeight((float)0.002*height);
    for (int i = 0; i <= height/2; i++) {
      stroke(i, i, i);
      line(i, height/2, i, height);
    }

    // Quadrant 4 Flower
    for (int angle = 0; angle < 360; angle += 45) {
      fill(215, 215, 0);
      stroke(0, 0, 0);
      strokeWeight((float)0.004*height);

      pushMatrix();
      translate((width/2)+width/4, (height/2)+height/4);
      rotate(radians(angle));
      ellipse(0,0,height/20,height/3);
      popMatrix();
    }
    
    // Flower Center Circle
    fill(69, 42, 0);
    noStroke();
    ellipse((width/2)+width/4, (height/2)+height/4, 50, 50);
	  
	// sample code, delete this stuff
    
  }
  
  // define other methods down here.
}