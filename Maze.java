import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color; 

public class Maze extends Canvas {
    private Cell[][] maze;

    public static final int ROWS = 10;
    public static final int COLS = 10; 
    public static final int CELL_HEIGHT = 50;
    public static final int CELL_WIDTH = 50; 

    public Maze() {
        setSize(MazeRunner.WIDTH, MazeRunner.HEIGHT);
        setBackground(Color.WHITE);
        setVisible(true); 

        // Your code starts here...
        maze = new Cell[ROWS][COLS];
        for (int r = 0; r<ROWS; r++){
            for(int c = 0; c<COLS; c++){
                maze[r][c] = new Cell(r, c);
            }
        }
        buildMaze();
    }

    private void buildMaze() {
        double x = 0;
        maze[0][0].removeRightWall();
        maze[0][0].removeBottomWall();
        for (int r = 0; r<ROWS; r++){
            for(int c = 0; c<COLS; c++){
                if (r>0 && c==0){
                    maze[r][c].removeTopWall();
                        maze[r-1][c].removeBottomWall();
                }
                if (c>0 && r==0){
                    maze[r][c].removeLeftWall();
                        maze[r][c-1].removeRightWall();
                }
                if (c>0 && r>0) {
                    x = Math.random();
                    if (x>.5){
                        maze[r][c].removeLeftWall();
                        maze[r][c-1].removeRightWall();
                    }
                    else {
                        maze[r][c].removeTopWall();
                        maze[r-1][c].removeBottomWall();
                    }
                }   
            }
        }
    }

    public void paint(Graphics window) {
        for(int r = 0; r<ROWS; r++){
            for(int c = 0; c<COLS; c++){
                maze[r][c].draw(window, (c*50), (r*50), CELL_WIDTH, CELL_HEIGHT);
            }
        }
    }
}
