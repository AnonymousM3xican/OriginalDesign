import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {



public void setup()
{
size(100,100);
}
public void draw()
{
 	face();
 	ears();
 	square();
 	oval(); 
}
public void face()
{
	fill(250,100,100);
  	ellipse(30,35,50,50);	
}
public void ears()
{
	fill(100,100,100);
  	ellipse(10,15,20,20);

  	ellipse(50,15,20,20);
}
public void square()
{
	fill(100,250,100);
  	rect(10,70,50,20);	
} 

public void oval()
{
	fill(100,100,250);
  	ellipse(80,50,20,90);	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
