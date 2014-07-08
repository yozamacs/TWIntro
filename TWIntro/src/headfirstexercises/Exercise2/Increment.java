package headfirstexercises.Exercise2;

public class Increment {
    int callSum;

    void increment(){
        callSum = callSum+1;
    }

    void total(){
        System.out.print("You called increment " + callSum + " times");
    }

}
