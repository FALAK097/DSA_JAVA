public class AreaOfCircle {
    public static void main(String[] args) {
        int radius = 3;
        areaOfCircle(radius);
    }

    static void areaOfCircle(int r) {
        double ans = 3.14 * r * r;
        System.out.println("Area of circle is: " + Math.floor(ans));
    }
}
