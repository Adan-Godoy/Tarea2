package Solucion;

abstract class Shape {
    protected RenderPlatform renderer;

    public Shape(RenderPlatform renderer) {
        this.renderer = renderer;
    }

    abstract void draw();
}
