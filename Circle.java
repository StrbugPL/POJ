public class Circle {

    private double radius;
    private String color;

    Circle()

    {
        radius = 22.22;
        color = "red";
            }


    Circle(double radius)
    {

         this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public Double getArea() {
        Double area = Math.PI * radius * radius;
        return area;
    }
}
