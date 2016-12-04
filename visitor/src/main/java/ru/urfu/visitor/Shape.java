/**
 * @author lifeandfree
 *         Пакет: ru.urfu.visitor
 *         Дата создания класса: 30 нояб. 2016 г.
 */
package ru.urfu.visitor;

/**
 * @author lifeandfree
 */
public abstract class Shape {

    public abstract void accept(ShapeVisitor shapeVisitor);

    abstract void draw(int x, int y);

    abstract String getArea();

    abstract String getNameShape();
}
