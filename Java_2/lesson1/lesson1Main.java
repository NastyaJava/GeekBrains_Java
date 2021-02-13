package lesson1;
import java.util.Random;

public class lesson1Main {
    static Random random = new Random();
    static int numberObstacles = random.nextInt(10) + 1;
    static int numberСompetitors = random.nextInt(5) + 1;
    static public void main( String[] args ){
        RunJampAble[] competitors = new RunJampAble[numberСompetitors];
        Obstacle[] obstacles = new Obstacle[numberObstacles];
        fillCompetitors( competitors );
        fillObstacles( obstacles );

        for(int i = 0; i < numberСompetitors; i++){
            competition( competitors[i], obstacles );
        }

    }

    static public void fillObstacles(Obstacle[] obstacles){
        for(int i = 0; i < numberObstacles; i++){
            int rnObst = random.nextInt(2);
            int dist = random.nextInt(500);
            int height = random.nextInt(10);

            if( rnObst == 0){
                obstacles[i] = new Wall(height);
            }
            else{
                obstacles[i] = new Treadmill(dist);
            }
        }
    }


    static public void fillCompetitors(RunJampAble[] competitors){
        int rnComp;
        int dist;
        int height;
        int countCat = 0;
        int countRobot = 0;
        int countHuman = 0;
        String name;

        for(int i = 0; i < numberСompetitors; i++){
            rnComp = random.nextInt(3);
            dist = random.nextInt(500);
            height = random.nextInt(10);

            if( rnComp == 0){
                countRobot++;
                name = "Robot_"+countRobot;
                competitors[i] = new Robot(name,dist,height);
            }
            else if( rnComp == 1){
                countCat++;
                name = "Cat_"+countCat;
                competitors[i] = new Cat(name,dist,height);
            }
            else{
                countHuman++;
                name = "Human_"+countHuman;
                competitors[i] = new Human(name,dist,height);
            }
        }
    }

    static public void competition( RunJampAble competitor, Obstacle[] obstacles){
        boolean result = true;
        String resultString;

        for( int i = 0; i < numberObstacles && result; i++){
            if(obstacles[i] instanceof Wall){
                if(competitor instanceof Cat){
                    result = obstacles[i].is_overcomeObstacle(((Cat) competitor).maxJumpHeight);
                }
                else if(competitor instanceof Robot){
                    result = obstacles[i].is_overcomeObstacle(((Robot) competitor).maxJumpHeight);
                }
                else if(competitor instanceof Human){
                    result = obstacles[i].is_overcomeObstacle(((Human) competitor).maxJumpHeight);
                }
            }
            else{
                if(competitor instanceof Cat){
                    result = obstacles[i].is_overcomeObstacle(((Cat) competitor).maxRunDist);
                }
                else if(competitor instanceof Robot){
                    result = obstacles[i].is_overcomeObstacle(((Robot) competitor).maxRunDist);
                }
                else if(competitor instanceof Human){
                    result = obstacles[i].is_overcomeObstacle(((Human) competitor).maxRunDist);
                }
            }
        }

        resultString = result?"successfully":"unsuccessfully";
        if(competitor instanceof Cat){
            System.out.println(((Cat) competitor).name+" passed the obstacle course "+resultString);
        }
        else if(competitor instanceof Robot){
            System.out.println(((Robot) competitor).name+" passed the obstacle course "+resultString);
        }
        else if(competitor instanceof Human){
            System.out.println(((Human) competitor).name+" passed the obstacle course "+resultString);
        }
        System.out.println();
    }
}
