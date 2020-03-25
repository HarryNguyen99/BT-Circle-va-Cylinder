public class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder(){

    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {

        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "chiều cao hình trụ = "
                + getHeight()
                + ", Thể tích hình trụ:  "
                + getVolume()
                + ", đó là một lớp con của "
                + super.toString();

    }
}
