package animals;

public class Dog extends Animal{
    private final int MAX_RUN=500;
    private final int MAX_SWIM=10;
    private static int count;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance<=MAX_RUN){
            System.out.println(name+" пробежал "+distance+"м");
            return;
        }
        System.out.println(name+" пробежал "+MAX_RUN+"м и устал");
    }


    @Override
    public void swim(int distance) {
        if (distance<=MAX_SWIM){
            System.out.println(name+" проплыл "+distance+"м");
            return;
        }
        System.out.println(name+" проплыл "+MAX_SWIM+"м и буль-буль");

    }
}
