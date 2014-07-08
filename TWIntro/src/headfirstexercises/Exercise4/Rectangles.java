package headfirstexercises.Exercise4;

/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/7/14
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
class Rectangles {
    private int height;
    private int width;

    Rectangles(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int area(){
        int area = height*width;
        return area;
    }

    public double perimeter(){
        double perimeter = (height+width)*2;
        return perimeter;
    }


}
