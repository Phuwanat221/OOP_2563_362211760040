package LAB8;

public class Triangle extends Object2D {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calArea() {
        double area_tri = 0.5 * base * height;
        super.setArea(area_tri);
    }
}
