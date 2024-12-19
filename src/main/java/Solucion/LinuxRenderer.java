package Solucion;

public class LinuxRenderer implements RenderPlatform {
    public void drawShape(String shape) {
        System.out.println("Dibujando " + shape + " en Linux");
    }
}
