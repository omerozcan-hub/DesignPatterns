import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Main extends JPanel {
    private Forest forest;

    public Main() {
        forest = new Forest();
        forest.plantTree(50, 100, "Oak", Color.GREEN, "Oak texture");
        forest.plantTree(200, 200, "Pine", Color.GREEN, "Pine texture");
        forest.plantTree(100, 300, "Birch", Color.WHITE, "Birch texture");
    }

    @Override
    public void paint(Graphics g) {
        forest.draw(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Main panel = new Main();
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
