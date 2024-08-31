public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Circle with color ");
        color.applyColor();
    }
}
