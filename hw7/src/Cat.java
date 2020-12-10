

public class Cat {
    private String name;
    private boolean satiety=false;
    private int hunger;

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate, int count) {
        if (plate.getFood()<count){
            System.out.println("cat " + name + " not eat...");
            return;
        }
        System.out.println("cat " + name + " eat...");
        plate.decreaseFood(count);
        satiety=true;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public int getHunger() {

        return hunger;
    }

    public void fear(Dog dog){
        System.out.println("Cat "+ name + " fear dog "+ dog.getName());
    }


}
