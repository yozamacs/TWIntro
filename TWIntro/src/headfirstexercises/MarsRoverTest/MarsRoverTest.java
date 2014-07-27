package headfirstexercises.MarsRoverTest;

import headfirstexercises.MarsRover.Rover;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MarsRoverTest {

    //@Test
   /* public void shouldMove1when1isGiven(){
        Rover rover1 = new Rover();
        rover1.move("");
        assertThat(rover1.getPosition(), is("1 1"));
    } */

    //@Test
    //public void shouldSetPositionWhenPositionIsGiven(){
        //Rover rover1 = new Rover();
        //assertThat(rover1.setPosition(1,1),is(true));
    //}

    @Test
    public void shouldChangeYTo2WhenMoveY1IsGiven(){
       Rover rover1 = new Rover();
        rover1.setPosition(1,1);
        rover1.setYMax(5);
        rover1.move("y");
        assertThat(rover1.getPosition(),is("1 2"));
    }

   @Test
    public void shouldChangeXTo2WhenMoveX2IsGiven(){
       Rover rover1 = new Rover();
       rover1.setPosition(1,1);
       rover1.setXMax(5);
       rover1.move("x");
       assertThat(rover1.getPosition(), is("2 1"));
   }

    @Test
    public void shouldShowXYPositionWhenPositionIsSetTo22(){
        Rover rover1 = new Rover();
        rover1.setPosition(2,2);
        assertThat(rover1.getPosition(), is("2 2"));
    }

    @Test
    public void shouldSetXMaxTo5WhenMaxIsSetToFive(){
        Rover rover1 = new Rover();
        rover1.setXMax(5);
        assertThat(rover1.XMax, is(5));
    }

    @Test
    public void shouldSetYMaxTo6WhenMaxIsSetToSix(){
        Rover rover1 = new Rover();
        rover1.setYMax(6);
        assertThat(rover1.YMax, is(6));
    }

    @Test
    public void shouldMoveXPositionToFiveWhenXMovesSixTimes(){
        Rover rover1 = new Rover();
        rover1.setXMax(5);
        rover1.move("x");
        rover1.move("x");
        rover1.move("x");
        rover1.move("x");
        rover1.move("x");
        rover1.move("x");
        assertThat(rover1.getPosition(),is("5 0"));
    }

    @Test
    public void shouldMoveYPositionToFiveWhenYMovesSixTimes(){
        Rover rover1 = new Rover();
        rover1.setYMax(5);
        rover1.move("y");
        rover1.move("y");
        rover1.move("y");
        rover1.move("y");
        rover1.move("y");
        rover1.move("y");
        assertThat(rover1.getPosition(),is("0 5"));
    }

    @Test
    public void shouldSetDirectionToNWhenInputIsNorth(){
        Rover rover1 = new Rover();
        rover1.setDirection('N');
        assertThat(rover1.getDirection(), is ('N'));
    }

    @Test
    public void shouldFaceWestWhenGivenDirectionLeft(){
        Rover rover1 = new Rover();
        rover1.setDirection('N');
        rover1.turn("L");
        assertThat(rover1.getDirection(), is ('W'));
    }

    @Test
    public void shouldFaceEastWhenGivenDirectionRight(){
        Rover rover1 = new Rover();
        rover1.setDirection('N');
        rover1.turn("R");
        assertThat(rover1.getDirection(), is ('E'));
    }

    @Test
    public void shouldMoveRoverTo10WhenMoveInDirectionIsNorth(){
        Rover rover1 = new Rover();
        rover1.setDirection('N');
        //rover1.setPosition(1,1);
        rover1.roverMove();
        assertThat(rover1.getPosition(),is("0 1"));
    }
}
