package lesson1;

public class Wall implements Obstacle{
    int height;

    Wall(int height){
        this.height = height;
    }

    @Override
    public boolean is_overcomeObstacle(int maxOvercomeHeight){
        if( maxOvercomeHeight >= height ){
            System.out.println("Height of "+height+" meters successfully overcome");
            return true;
        }
        else{
            System.out.print("The height of "+height+" meters has not been overcome.");
            System.out.println(" Can jump a maximum of "+maxOvercomeHeight+" meters.");
            return false;
        }
    }
}
