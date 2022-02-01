import javax.swing.JFrame;
import java.awt.Component; 

/**
 * This file is complete. You don't need to do anything to it, but
 * it is where you'll run your project when you're ready to see
 * your maze. 
 */
public class MazeRunner extends JFrame {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    public MazeRunner() {
        super("Maze Builder");
        setSize(WIDTH, HEIGHT);
        getContentPane().add(new Maze()); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MazeRunner(); 
    }
}
