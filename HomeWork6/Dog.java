public class Dog extends Animal
{
    static int countDogs = 0;
    final int maxRunDis = 500;
    final int maxSwimDis = 10;

    Dog(String name) {
        super(name);
        countDogs++;
    }

    public void run( int distance )
    {
        if( distance <= maxRunDis )
        {
            System.out.println(this.name+" пробежал "+distance+" метров.");
        }
        else
        {
            System.out.println(this.name+" не может пробежать "+distance+" метров, максимум "+maxRunDis);
        }
    }

    public void swim( int distance )
    {
        if( distance <= maxSwimDis )
        {
            System.out.println(this.name+" проплыл "+distance+" метров.");
        }
        else
        {
            System.out.println(this.name+" не может проплыть "+distance+" метров, максимум "+maxSwimDis);
        }
    }

    void getCountDogs()
    {
        System.out.println("Создано "+countDogs+" собак.");
    }
}
