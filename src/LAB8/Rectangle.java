package LAB8;

public class Rectangle extends Object2D {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calArea() {
        double area_rec = width * height;
        super.setArea(area_rec);
    }
}
