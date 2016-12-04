/**
 * @author lifeandfree
 *         Пакет: ru.urfu.visitor
 *         Дата создания класса: 30 нояб. 2016 г.
 */
package ru.urfu.visitor;

/**
 * @author lifeandfree
 */
public class AreaVisitor implements ShapeVisitor {

    String area;

    public AreaVisitor() {
        super();
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    @Override
    public void visit(Pentagon pentagon) {
        this.area = pentagon.getClass().getSimpleName() + " Area";
        System.out.println(this.area + ": " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        this.area = rectangle.getClass().getSimpleName() + " Area";
        System.out.println(this.area + ": " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        this.area = triangle.getClass().getSimpleName() + " Area";
        System.out.println(this.area + ": " + area);
    }

}
