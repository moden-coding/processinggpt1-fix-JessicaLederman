import processing.core.*;

public class App extends PApplet{
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    
    
        // The setup function is called once when the program starts
        public void settings() {
            size(1000, 800);  // Set the window size to 800x600
        }
    
        // The draw function is called repeatedly
        public void setup() {
            background(173, 216, 230);  // Set the background to light gray (RGB)
        }
    
        public void draw() {
            fill(255, 182, 193);
            stroke(255, 0, 0);  // Set the stroke color to red (RGB: 255, 0, 0)
        strokeWeight(5);  // Set the stroke thickness to 5 pixels
            ellipse(700, 50, 50, 60);
            fill(300, 16, 32);
            rect(50, 50, 200, 100);
            fill(1, 1, 1);
            rect(500, 27, 83, 14);
            stroke(0, 255, 0);  // Set the stroke color to green (RGB: 0, 255, 0)
            strokeWeight(3);
        line(100, 300, 600, 300);
        fill(0, 0, 255);  // Set the fill color to blue
        stroke(0);  // Set the stroke color to black for the triangle
        strokeWeight(2);  // Set the stroke thickness to 2 pixels
        triangle(600, 100, 700, 200, 500, 200);  // Draw the triangle
          
    
        }
        
             
        
    }


    



