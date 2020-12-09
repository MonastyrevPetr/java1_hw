package animals;

public class Cat extends Animal {
    private final int MAX_RUN=200;
    private static int count;

    public Cat(String name, String color, int age) {
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
        System.out.println("Кошки не умеют плавать");
    }
}
