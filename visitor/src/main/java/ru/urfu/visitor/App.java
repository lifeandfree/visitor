package ru.urfu.visitor;

public class App {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] {
                new Pentagon(), new Rectangle(), new Triangle()
        };
        showName(shapes);
    }

    private static void showName(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.accept(new AreaVisitor());
        }
        for (Shape shape : shapes) {
            shape.accept(new DrawVisitor(2, 2));
        }
        for (Shape shape : shapes) {
            shape.accept(new NameVisitor());
        }
    }
}
