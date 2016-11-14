
// Sometimes you need global variables. You can think of these as
// "private class variables," because that's what they are (Processing
// hides the details of this).

// The number of cities we'll have--will set later.
int numCities;
// An array of Point objects, each representing a city.
Point[] cities;

// The distance at which cities will be in danger.
double dangerZone = 50;

// The setup() function is called exactly once in this program.
// You can think of it as a constructor, of sorts.
void setup() {
  // This needs to be the first line in your setup() function and
  // sets the size of the screen. The variable "width" and "heigh"
  // are also set here.
  size(400, 400);
  numCities = 100;
  cities = new Point[numCities];

  // Each Point in "cities" is null--so create a new one with
  // a random heght, size, and color.
  for (int i = 0; i < numCities; i++) {
    // Use the Point constructor with a position.
    cities[i] = new Point(this, (int)random(width), (int)random(height));
    cities[i].setSize((int)random(5, 20));
    cities[i].setColor(color(random(255), random(255), random(255)));
  }
}

// This function gets called many thousands of times per second.
// Can change this by calling the frameRate(<NUM>) function.
void draw() {
  // Set the background to white (what color?)
  background(255);
  // I don't like lines around my circles. Turn them off.
  noStroke();

  // Get the point that the mouse is at. The pink variables are
  // already set for you in Processing.
  Point mousePoint = new Point(this, mouseX, mouseY);

  // Loop over each city, randomly moving it, and setting its color
  // if it's close to the mouse.
  for (int i = 0; i < numCities; i++) {
    // Move each point a random amount between -2 and 2 points.
    cities[i].translatePoint((int)random(-2, 2), (int)random(-2, 2));

    // If the distance from the mouse to the point is within some
    // limit, set the color to red.
    if (cities[i].distance(mousePoint) < dangerZone) {
      cities[i].setColor(color(255, 0, 0));
    } else {
      cities[i].setColor(color(0, 0, 0));
    }

    // Now, draw the point in whatever color it is (and whatever
    // position it is at).
    cities[i].drawPoint();
  }
}

// If the mouse is clicked, "destroy" all cities that are within
// the "dangerZone" (just move them someplace else).
void mousePressed() {
  Point mousePoint = new Point(this, mouseX, mouseY);

  for (int i = 0; i < numCities; i++) {
    if (cities[i].distance(mousePoint) < dangerZone) {
      // Need to get the size so we can use it later.
      int prevSize = cities[i].getSize();
      // If it's hit, move it to a new random location.
      cities[i] = new Point(this, (int)random(width), (int)random(height));
      // Set the size to the former size or it will have size 0
      // and not show up.
      cities[i].setSize(prevSize);
    }
  }
}


void keyPressed() {
  if (key == ENTER) {
    for (int i = 0; i < numCities; i++) {
      System.out.println("Mine: " + cities[i].getID() + " vs global: " + Point.globalID); 
    }
  }
}