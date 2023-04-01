public class TestCircle {

    public void main() {

        Circle circle1 = new Circle();  // Object 1
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(3.31);  // Object 2
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
}
}
