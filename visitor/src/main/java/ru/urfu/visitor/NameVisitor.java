package ru.urfu.visitor;

public class NameVisitor implements ShapeVisitor {

    public NameVisitor() {
        super();
    }

    @Override
    public void visit(Pentagon pentagon) {
        System.out.println("Name: " + pentagon.getClass().getSimpleName());

    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Name: " + rectangle.getClass().getSimpleName());

    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Name: " + triangle.getClass().getSimpleName());

    }

}
