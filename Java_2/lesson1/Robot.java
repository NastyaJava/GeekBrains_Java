package lesson1;

public class Robot implements RunJampAble{
    String name;
    int maxRunDist;
    int maxJumpHeight;

    Robot(String name, int dist, int height){
        this.name = name;
        this.maxRunDist = dist;
        this.maxJumpHeight = height;
    }

    @Override
    public void jump() {
        System.out.println(name+" is jumping.");
    }

    @Override
    public void run() {
        System.out.println(name+" is running.");
    }
}
