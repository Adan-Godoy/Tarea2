package Solucion;

import Solucion.WindowsRenderer;

public class Main {
    public static void main(String[] args) {
        RenderPlatform windowsRenderer = new WindowsRenderer();
        RenderPlatform linuxRenderer = new LinuxRenderer();

        Shape circle = new Circle(windowsRenderer);
        Shape rectangle = new Rectangle(linuxRenderer);

        circle.draw(); // Dibujando un círculo en Windows
        rectangle.draw(); // Dibujando un rectángulo en Linux
    }
}
