import java.awt.Color;
import java.awt.Graphics;

public class TreeType {
    private String name;
    private Color color;
    private String texture;

    public TreeType(String name, Color color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x - 1, y, 3, 5);  // basit bir ağaç gövdesi çizimi
        g.drawString(name, x, y);     // ağacın adını yazdır
    }
}