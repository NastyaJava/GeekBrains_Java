public class Plate {
    private int food;

    public Plate( int food ){

        this.food = food;
    }

    public void decreaseFood( Cat cat ){
        if( cat.getAppetite() <= this.food ){
            this.food -= cat.getAppetite();
            cat.setSatiety();
        }
        else{
            System.out.print("Недостаточно еды для кота. ");
            System.out.println("В тарелке осталось "+this.food+" корминок, а кот хочет "+cat.getAppetite()+" корминок.");
        }
    }

    public void info(){

        System.out.println("В тарелке "+this.food+" корминок");
    }


    public void addFood( int addedFood ){
        this.food += addedFood;
    }
}
