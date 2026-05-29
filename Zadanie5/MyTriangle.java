public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle (int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString() {
        return "MyTriangle[v1=" + this.v1.toString() + ",v2=" + this.v2.toString() + ",v3=" + this.v3.toString() + "]";
    }

    // do wyliczenia dlugosci boku do stworzenia trojkata, do którego liczymy obwod
    public double getPerimeter() {
        double bok1 = this.v1.distance(this.v2);
        double bok2 = this.v2.distance(this.v3);
        double bok3 = this.v3.distance(this.v1);

        return bok1 + bok2 + bok3;
    }

    public String getType() {
        double bok1 = this.v1.distance(this.v2);
        double bok2 = this.v2.distance(this.v3);
        double bok3 = this.v3.distance(this.v1);

        if (bok1 == bok2 && bok2 == bok3) {
            return "Equilateral"; // Równoboczny
        } else if (bok1 == bok2 || bok1 == bok3 || bok2 == bok3) {
            return "Isosceles"; // Równoramienny
        } else {
            return "Scalene"; // Różne boki
        }
    }
}
