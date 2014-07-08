package headfirstexercises.Exercise3;

public class Main {

    public static void main(String[] args) {
        Rectangles[] rects;
        rects = new Rectangles[5];

        int x =0;
        int areaSum = 0;

        while (x<5){
            rects[x] = new Rectangles();
            rects[x].height = x+2;
            rects[x].width = x+3;
            rects[x].area();
            areaSum = areaSum + rects[x].area;
            x=x+1;
        }

        double average = areaSum/rects.length;

        System.out.print("The average of the rectangle areas is " + average);

    }
}
