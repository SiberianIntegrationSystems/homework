package pro.sisit.hr.widget.domain;

import pro.sisit.hr.widget.api.Shape;

/**
 * прямоугольная фигура на плоскости
 */
public class Shape2D implements Shape {

    private final int height;
    private final int width;
    private final Point leftUpper;
    public Shape2D(int height, int width, Point leftUpper) {
        this.height = height;
        this.width = width;
        this.leftUpper = leftUpper;
    }

    @Override
    public String toString() {
        return "Shape2d{" +
            "height=" + height +
            ", width=" + width +
            ", leftUpper=" + leftUpper +
            ", rightDown=" + rightDown() +
            '}';
    }

    @Override
    public boolean intersects(Shape anotherShape) {
        // todo
        return false;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public Point leftUpper() {
        return leftUpper;
    }

    @Override
    public Point rightDown() {
        return new Point(leftUpper.x() + width, leftUpper().y() + height);
    }

}
