public class Cat extends Animal
{
    static int countCats = 0;
    final int maxRunDis = 200;

    Cat(String name)
    {
        super(name);
        countCats++;
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

    public void swim()
    {
        System.out.println(this.name+" не умеет плавать.");
    }

    void getCountCats()
    {
        System.out.println("Создано "+countCats+" котов.");
    }
}
