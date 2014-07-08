package headfirstexercises.Exercise4;

public class Main {

    public static void main(String[] args) {

        printSums(new Rectangles[]{new Rectangles(1, 2), new Rectangles(1, 4), new Rectangles(3,7), new Rectangles(2,9), new Rectangles(5,6)});

    }

    private static void printSums(Rectangles[] rects) {
        int areaSum = 0;
        double perSum = 0;

        for (Rectangles rect : rects) {
            areaSum += rect.area();
            perSum += rect.perimeter();
        }

        System.out.println("The sum of the rectangle areas is " + areaSum + " and the sum of the perimeters is " + perSum);
    }
}
