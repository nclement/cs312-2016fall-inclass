
// Each box is of size 10
int sizeOfBox = 10;
int numBoxes;
// Each cell will be true if the cell is living.
boolean[][] cells;

void setup() {
  size(600, 600);
  numBoxes = width / sizeOfBox;
  cells = new boolean[numBoxes][numBoxes];
}

void draw() {
  background(0);
  drawCells();
}

// Function is called when the mouse is pressed (handles repeat presses)
void mousePressed() {
  int cellX = mouseX / sizeOfBox;
  int cellY = mouseY / sizeOfBox;

  cells[cellX][cellY] = !cells[cellX][cellY];
}

void drawCells() {
  fill(255, 0, 0);
  stroke(0);
  int offset = sizeOfBox / 2;
  for (int i = 0; i < cells.length; i++) {
    for (int j = 0; j < cells[i].length; j++) {
      // Color each cell by the number of neighbors it has.
      int neighbors = getNumNeighbors(i, j);
      // lerpColor takes two colors and a value from 0-1 representing
      // how much of each color it should add.
      color from = color(255, 20, 0);
      color to = color(0, 100, 255);
      fill(lerpColor(from, to, neighbors/8.0));
      if (cells[i][j]) {
        //rect(i * sizeOfBox, j * sizeOfBox, sizeOfBox, sizeOfBox);
        ellipse(i * sizeOfBox + offset, j * sizeOfBox + offset, 
          sizeOfBox, sizeOfBox);
      }
    }
  }
}

int getNumNeighbors(int x, int y) {
  int neighbors = 0;
  for (int i = x - 1; i <= x + 1; i++) {
    for (int j = y - 1; j <= y + 1; j++) {
      if (cells[i][j]) {
        neighbors++;
      }
    }
  }

  if (cells[x][y]) 
    return neighbors - 1;
  else
    return neighbors;
}