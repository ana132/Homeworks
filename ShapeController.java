public class ShapeController {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

//     System.out.println(rectanglePerimeter(7, 10));
//     System.out.println(trianglePerimeter(4,7,9));

        changeTriangleP(triangle, 4,8,2);
        changeRectangleP(rectangle, 5, 8 );

    }

    public static int  trianglePerimeter (int a, int b, int c) {
        return (a + b + c);
    }

    public static int rectanglePerimeter (int h, int w) {
        return (2 * (h + w));
    }

    public static void changeRectangleP (Rectangle cRectangle, int x, int y) {
        cRectangle.heigh =+ x;
        cRectangle.width =+ y;
    }

    public static void changeTriangleP (Triangle cTriangle, int d, int e, int f) {
        cTriangle.lenghOne =+ d;
        cTriangle.lenghTwo =+ e;
        cTriangle.lenghThree =+ f;
    }


}
