public class Circle {
    private static int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static void getArea()
    {
        System.out.println(Math.PI*radius*radius);
    }
    public static void getCircumference()
    {
        System.out.println(Math.PI*radius*2);
    }
}
