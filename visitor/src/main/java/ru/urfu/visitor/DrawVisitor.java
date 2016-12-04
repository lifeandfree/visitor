package ru.urfu.visitor;

public class DrawVisitor implements ShapeVisitor {

    private int x;
    private int y;

    public DrawVisitor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void visit(Pentagon pentagon) {
        pentagon.setX(x);
        pentagon.setY(y);
        System.out.println("draw " + pentagon.getClass().getSimpleName() + "on the " + pentagon.getX() + " and "
                + pentagon.getY());

    }

    @Override
    public void visit(Rectangle rectangle) {
        rectangle.setX(x);
        rectangle.setY(y);
        System.out.println("draw " + rectangle.getClass().getSimpleName() + "on the " + rectangle.getX() + " and "
                + rectangle.getY());
    }

    @Override
    public void visit(Triangle triangle) {
        triangle.setX(x);
        triangle.setY(y);
        System.out.println("draw " + triangle.getClass().getSimpleName() + "on the " + triangle.getX() + " and "
                + triangle.getY());
    }

}
