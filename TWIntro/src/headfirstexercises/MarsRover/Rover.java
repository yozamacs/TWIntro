package headfirstexercises.MarsRover;


public class Rover {
    private int x;
    private int y;
    public int XMax;
    public int YMax;
    private char direction;



    public void move(String axis) {
        if(axis.equals("y")&&y<YMax){
            y+=1;
        }
        if(axis.equals("x")&&x<XMax){
            x+=1;
        }
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getPosition() {
        String result;
        result = String.valueOf(x) + " " + String.valueOf(y);
        return result;
    }

    public void setXMax(int maxx) {
        XMax = maxx;
    }

    public void setYMax(int maxy) {
        YMax = maxy;
    }

    public void setDirection(char dir) {
        direction = dir;
    }

    public char getDirection() {
        return direction;
    }

    public void turn(String side) {
        if(side.equals("L")){
            switch (direction){
                case 'N': setDirection('W');
                    break;
                case 'E': setDirection('N');
                    break;
                case 'S': setDirection('E');
                    break;
                case 'W': setDirection('S');
                    break;
            }

        }
        if(side.equals("R")){
            switch (direction){
                case 'N': setDirection('E');
                    break;
                case 'E': setDirection('S');
                    break;
                case 'S': setDirection('W');
                    break;
                case 'W': setDirection('N');
                    break;
            }
        }
    }

    public void roverMove() {
        switch (direction){
            case 'N':
                y+=1;
                break;
            case 'E':
                x+=1;
                break;
            case 'S':
                y-=1;
                break;
            case 'W':
                x -= 1;
                break;
        }

    }
}
