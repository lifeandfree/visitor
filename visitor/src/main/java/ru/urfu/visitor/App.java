package ru.urfu.visitor;

public class App {
    public static void main(String[] args) {

        IShape[] shapes = new IShape[] {
                new Pentagon(), new Rectangle(), new Triangle()

        };

        showName(shapes);

    }

    private static void showName(IShape[] shapes) {
        for (IShape shape : shapes) {
            System.out.println(shape.getNameShape());
        }

    }
}
