import java.awt.Graphics; 

public class Cell {
    private int row;
    private int col;
    private boolean wallTop;
    private boolean wallBottom;
    private boolean wallLeft;
    private boolean wallRight;

    public Cell(int r, int c) {
        row = r;
        col = c;
        wallTop=wallBottom=wallLeft=wallRight=true;
    }

    public boolean hasTopWall() {
        return wallTop; 
    }
    public boolean hasBottomWall() {
        return wallBottom;
    }
    public boolean hasLeftWall() {
        return wallLeft;
    }
    public boolean hasRightWall() {
        return wallRight;
    }
    public void removeTopWall() {
        wallTop = false;
    }
    public void removeBottomWall() {
        wallBottom = false;
    }
    public void removeLeftWall() {
        wallLeft = false;
    }
    public void removeRightWall() {
        wallRight = false;
    }
    public int getRow() {
        return row; 
    }
    public int getCol() {
        return col; 
    }

    public void draw(Graphics window, int x, int y, int width, int height) {
        if(hasTopWall()){
            window.drawLine(x,y,x+width,y);
        }
        if(hasLeftWall()){
            window.drawLine(x,y,x,y+height);
        }
        if(hasRightWall()){
            window.drawLine(x+width,y,x+width,y+height);
        }
        if(hasBottomWall()){
            window.drawLine(x, y+height,x+width, y+height);
        }
    }

    public String toString() {
        return "row: " + row + ", " + col + " - Walls: " + (hasTopWall()?"Top ":"") + (hasBottomWall()?"Bottom ":"") + (hasLeftWall()?"Left ":"") + (hasRightWall()?"Right":"");
    }
}