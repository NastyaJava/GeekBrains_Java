public class Main {
    static public void main( String[] args ){
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Мурзик", 5);
        cats[2] = new Cat("Пушок", 30);
        cats[3] = new Cat("Персик", 15);
        cats[4] = new Cat("Бублик", 9);

        Plate plate = new Plate(50);

        plate.info();

        for( int i = 0; i < cats.length; i++ ){
            cats[i].eat(plate);
            cats[i].infoSatiety();
        }

        plate.addFood(20);
        plate.info();
    }
}
