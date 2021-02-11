public class Animal {
    String name;
    static int countAnimals = 0;

    Animal(String name)
    {
        this.name = name;
        countAnimals++;
    }

    public void run( int distance )
    {
        System.out.println(this.name+" пробежал "+distance+" метров.");
    }

    public void swim( int distance )
    {
        System.out.println(this.name+" проплыл "+distance+" метров.");
    }

    void getCountAnimals()
    {
        System.out.println("Создано "+countAnimals+" животных.");
    }
}
