/**
 * @author lifeandfree
 *         Пакет: ru.urfu.visitor
 *         Дата создания класса: 30 нояб. 2016 г.
 */
package ru.urfu.visitor;

/**
 * @author lifeandfree
 */
public class Pentagon extends Shape {

    private int x;
    private int y;

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param x
     *            the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y
     *            the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
