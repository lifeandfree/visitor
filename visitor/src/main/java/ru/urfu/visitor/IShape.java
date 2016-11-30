/**
 * @author lifeandfree
 *         Пакет: ru.urfu.visitor
 *         Дата создания класса: 30 нояб. 2016 г.
 */
package ru.urfu.visitor;

/**
 * @author lifeandfree
 */
interface IShape {

    public void accept(ShapeVisitor shapeVisitor);

    void draw(int x, int y);

    String getArea();

    String getNameShape();
}
