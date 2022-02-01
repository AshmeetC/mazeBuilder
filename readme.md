## Maze Builder

For this project, you're going to generate a random maze using the the binary tree algorithm, which is explained below in the instructions for the `buildMaze` method. There are many more algorithms for generating random mazes, but most of them use techniques that are out of scope for this course. 

The maze generated will be a *perfect maze*, which is one where there is exactly one route between any two points in the maze. 

![](img/maze.png)

## Cell class
Each cell in the maze has to know its position and what walls it has. It also knows how to draw itself when the maze tells it where to start. 

### Constructor
The `Cell` constructor should set instance variables to the passed parameters. All walls should start out `true`. 

### has_X_Wall methods
Return `true` if the `Cell` has that wall, or `false` if not.

### remove_X_Wall methods
Remove the wall from `Cell` so that it's not drawn. 

### draw method
This draws the cell at the position given by the `Maze` class. 

You'll want to use the [drawLine method](https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html#drawLine(int,%20int,%20int,%20int)) on the `window` parameter in this method. 

You probably want to hold off on this method until you've got the `Maze` class working. 

### toString method
This method is complete and can be used when debugging. 

## Maze class

The `Maze` class *has-a* 2D array of `Cell` references that represent the maze. It is not a 2D array of cells. 

### Constructor
Get the `maze` instance variable ready for use and call the `buildMaze` method. You're going to want to use the constant values to create the matrix. 

There are a few lines already in the constructor. Leave them there. Your code goes below. 

### buildMaze method
This is where the binary tree algorithm is run. The pattern is:
* All cells in the first column, except row 0 have their top wall removed
* All cells in the first row, except for column 0 have their left wall removed
* All other cells randomly have either their top or left wall removed.

When you remove a wall from a cell, you also need to remove the matching wall from its neighbor. For example, if you remove the top wall in the cell at row 3, column 2; you will also remove the bottom wall in the cell at row 2, column 2. 

A trait of mazes generated with this algorithm is that they have a path, known as a river, running across the top row and left most column. 

### paint method
Iterate through the maze and tell each `Cell` where to draw itself. 

## MazeRunner class
This class is complete. You don't need to change anything in it, but it is the file you'll run once you're ready to see your maze. 