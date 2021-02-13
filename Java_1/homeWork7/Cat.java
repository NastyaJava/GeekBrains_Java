public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat( String name, int appetite ){
        this.name = name;
        this.appetite = appetite;
    }

    public void eat( Plate plate) {
        plate.decreaseFood( this );
    }

    public int getAppetite(){
        return this.appetite;
    }

    public void setSatiety(){
        this.satiety = true;
    }

    public void infoSatiety(){
        String state = this.satiety?"сытый":"голодный";
        System.out.println("Кот "+this.name+" "+state);
    }
}
