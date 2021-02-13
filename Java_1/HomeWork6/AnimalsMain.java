public class AnimalsMain {
    static public void main(String[] args){
        int countOfDog = 0;
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурка");
        Dog dog2 = new Dog("Шарик");
        Cat cat2 = new Cat("Барсик");
        Dog dog3 = new Dog("Амур");

        dog1.run(550);
        cat1.swim();
        cat2.run(100);
        dog2.swim(19);

        dog1.getCountDogs();
        cat1.getCountCats();
        dog3.getCountAnimals();
    }


}
