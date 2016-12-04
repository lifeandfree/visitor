package ru.urfu.visitor;

public class Triangle extends Shape {

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("draw " + Triangle.class.getSimpleName() + "on the " + x + " and " + y);

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
