package Solucion;

public class Circle extends Shape {
    public Circle(RenderPlatform renderer) {
        super(renderer);
    }

    @Override
    void draw() {
        renderer.drawShape("un círculo");
    }
}
