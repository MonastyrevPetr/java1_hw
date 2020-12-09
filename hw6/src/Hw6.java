import animals.Animal;
import animals.Cat;
import animals.Dog;

public class Hw6 {
    public static void main(String[] args) {
        Animal[] animals=new Animal[10];
        animals[0]=new Cat("Murzic","black",2);
        animals[1]=new Dog("Sharic","white",5);
        animals[2]=new Cat("Ryzhic","red",4);
        animals[3]=new Dog("Bobic","black",6);
        animals[4]=new Cat("Vaska","black",2);
        System.out.println(Animal.getCount()+" "+Cat.getCount()+" "+Dog.getCount());
        animals[0].run(150);
        animals[0].swim(150);
        animals[1].run(200);
        animals[1].swim(20);
    }
}
