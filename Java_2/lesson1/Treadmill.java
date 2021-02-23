package lesson1;

public class Treadmill implements  Obstacle{
    int distance;

    Treadmill(int distance){
        this.distance = distance;
    }

    @Override
    public boolean is_overcomeObstacle(int maxOvercomeDist){
        if( maxOvercomeDist >= distance ){
            System.out.println("Distance of "+distance+" meters successfully overcome");
            return true;
        }
        else{
            System.out.print("The distance of "+distance+" meters has not been overcome.");
            System.out.println(" You can run a maximum of "+maxOvercomeDist+" meters.");
            return false;
        }
    }
}
