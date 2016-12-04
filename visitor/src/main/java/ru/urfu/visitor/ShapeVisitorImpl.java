/**
 * @author lifeandfree
 *         Пакет: ru.urfu.visitor
 *         Дата создания класса: 30 нояб. 2016 г.
 */
package ru.urfu.visitor;

/**
 * @author lifeandfree
 */
public class ShapeVisitorImpl implements ShapeVisitor {

    String area;

    @Override
    public void visit(Pentagon pentagon) {
        this.area = pentagon.getArea();
        System.out.println(pentagon.getNameShape() + ": " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        this.area = rectangle.getArea();
        System.out.println(rectangle.getNameShape() + ": " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        this.area = triangle.getArea();
        System.out.println(triangle.getNameShape() + ": " + area);
    }

}
