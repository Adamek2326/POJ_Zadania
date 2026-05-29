public class MyPoint {
    private int x = 0;
    private int y = 0;


    public MyPoint() {
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {
                this.x, this.y};
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    // wzór na mierzenie odległości między 2 pktami:
    // sqrt[(x2 - x1)^2 + (y2 - y1)^2]

    // punkt A to B mierzy odległość z A do B

    public double distance(int x, int y) {
        int xDifference = x - this.x;
        int yDifference = y - this.y;

        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }
    // punkt A to B mierzy odległość z A do B do utworzonej
    public double distance(MyPoint another) {
        double xDifference = another.getX() - this.x;
        double yDifference = another.getY() - this.y;

        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }

    public double distance() {
        double xDifference = 0 - this.x;
        double yDifference = 0 - this.y;

        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }


}