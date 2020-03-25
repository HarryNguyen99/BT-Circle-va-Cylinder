public class Circle {
    private String color = "green";
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "bán kính đường tròn = "
                + getRadius()
                + ", Diện tích hình tròn:  "
                + getArea()
                + ", Chu vi hình tròn: "
                + getPerimeter()
                + ", mầu: "
                + getColor();

    }
}
