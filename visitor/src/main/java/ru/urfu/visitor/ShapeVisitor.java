package ru.urfu.visitor;

interface ShapeVisitor {

    public void visit(IShape shape);

    public void visit(Pentagon pentagon);

    public void visit(Rectangle rectangle);

    public void visit(Triangle triangle);

}
