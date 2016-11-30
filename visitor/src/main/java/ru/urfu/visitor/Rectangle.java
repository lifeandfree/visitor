/**
 * @author lifeandfree
 *         Пакет: ru.urfu.visitor
 *         Дата создания класса: 30 нояб. 2016 г.
 */
package ru.urfu.visitor;

/**
 * @author lifeandfree
 */
public class Rectangle implements IShape {

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("draw " + Rectangle.class.getSimpleName() + "on the " + x + " and " + y);
    }

    @Override
    public String getArea() {
        return this.getClass().getSimpleName() + " Area";
    }

    @Override
    public String getNameShape() {
        return this.getClass().getSimpleName();
    }

}
