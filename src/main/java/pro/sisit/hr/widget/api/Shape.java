package pro.sisit.hr.widget.api;

import pro.sisit.hr.widget.domain.Point;

/**
 * геометрическая фигура на плоскости
 */
public interface Shape {
    boolean intersects(Shape anotherShape);
    int getHeight();
    int getWidth();
    Point leftUpper();
    Point rightDown();
}
