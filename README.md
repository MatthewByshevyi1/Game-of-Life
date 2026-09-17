1. Why is a 2D array appropriate for the Game of Life?
  Because it stores a grid of cells with rows and columns like the original game of life. This allows us to store the whole map grid of cells into
  one object.

2. What do society.length and society[row].length represent?
  society.length refers to the number of rows in the grid of society, while society[row].length represents the number of columns in the grid.
   
3. Why could changing society directly while traversing it produce incorrect results?
  Because if you are modifying it it might interfere with the cells next to it since there hadn't been a live or dead cell there before which
  might mess up the process of updating the grid.
   
4. Why must neighborCount() check array boundaries?
  Because if you just try to check all the cells around the cell you are currently focused on, you might run into an out of bounds exception, which
  would mess up your program, and potentially cause it to crash if it's not handled.
   
5. Why do we need a second 2D array inside update()?
  Because, as answered in question 3, modifying the original array could cause problems, meaning that we have to do it in a separate array, and then
  transfer this modified grid back to the original array.
   
6. How can the same GameOfLife object be displayed as both text and graphics?
  Because you can use the data stored in the object in multiple places, like for example the toString() that we made, and also in the graphics UI, it
  just requires you to interpret the data differently.
    
7. What happens to a glider when it reaches the edge of our board, and how is that different 
   from a wraparound?
  When it reaches the edge it turns into a 2x2 square, since it's not able to move forward anymore, causing some cells to die off, while in a wraparound
  it would continue from the other side of the board.
