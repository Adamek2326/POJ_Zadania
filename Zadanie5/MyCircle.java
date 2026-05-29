public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {
    }

    public MyCircle (int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return this.center.getXY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return "MyCircle[ radius = " + this.radius + ", center = " + this.center.toString() + " ]" ;
    }

    // pole koła = PI * r^2
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    // obwód koła = 2 * PI * r
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
    // liczy odgłość od koła
    public double distance(MyCircle another) {
        return this.center.distance(another.getCenter());
    }

}
