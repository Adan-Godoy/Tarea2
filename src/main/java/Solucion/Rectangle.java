package Solucion;

class Rectangle extends Shape {
    public Rectangle(RenderPlatform renderer) {
        super(renderer);
    }

    @Override
    void draw() {
        renderer.drawShape("un rectángulo");
    }
}