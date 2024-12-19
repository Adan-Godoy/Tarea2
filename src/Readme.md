# Patrón de Diseño: Bridge

## Descripción
El patrón Bridge desacopla la abstracción de su implementación, permitiendo que ambas evolucionen de forma independiente. Este ejemplo demuestra cómo aplicar este patrón en un sistema que dibuja formas geométricas (`Círculo`, `Rectángulo`) en diferentes plataformas (`Windows`, `Linux`).

## Estructura del repositorio
- **`original/`**: Contiene el código original con implementaciones acopladas, donde cada combinación de forma y plataforma requiere una nueva clase.
- **`solución/`**: Implementa el patrón Bridge para desacoplar formas y plataformas, reduciendo la cantidad de clases necesarias y aumentando la flexibilidad.

## Problemática inicial
En el código original:
- Cada combinación de forma y plataforma requiere una clase separada (por ejemplo, `CircleWindows`, `CircleLinux`).
- La adición de nuevas formas o plataformas incrementa el número de clases de manera exponencial.
- El diseño es rígido y difícil de mantener.

## Solución con el patrón Bridge
En la solución:
- Las formas (`Shape`, `Circle`, `Rectangle`) están desacopladas de las plataformas (`WindowsRenderer`, `LinuxRenderer`) mediante la interfaz `RenderPlatform`.
- Añadir nuevas formas o plataformas es sencillo y no afecta al código existente.
- Promueve la reutilización de código.

## Estructura del código
1. **Interfaz `RenderPlatform`:**
   Define cómo las plataformas deben implementar el método `drawShape()`.

2. **Implementaciones concretas:**
    - `WindowsRenderer`: Dibuja formas en Windows.
    - `LinuxRenderer`: Dibuja formas en Linux.

3. **Clases abstractas:**
    - `Shape`: Define la interfaz común para todas las formas.
    - `Circle` y `Rectangle`: Extienden `Shape` y delegan el dibujo a la plataforma correspondiente.



