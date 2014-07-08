package headfirstexercises.Exercise1;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x<100){
            if (x%2==1){
                 sum = sum +x;
            }
            x = x+1;
        }
        System.out.print("The sum is " + sum);
    }
}
