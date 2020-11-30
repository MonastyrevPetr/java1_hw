public class Hw5 {
    public static void main(String[] args) {
        Person[] persArr= new Person[5];
        persArr[0]=new Person("Ivanov Ivan","Engineer","iv@mail.ru","123456",30000,30);
        persArr[1]=new Person("Petrov Ivan","Engineer","iv@mail.ru","123456",30000,35);
        persArr[2]=new Person("Sidorov Ivan","Engineer","iv@mail.ru","123456",30000,40);
        persArr[3]=new Person("Kac Ivan","Engineer","iv@mail.ru","123456",30000,45);
        persArr[4]=new Person("Kuznecov Ivan","Engineer","iv@mail.ru","123456",30000,50);
        for (int i = 0; i < persArr.length; i++) {
            if (persArr[i].getAge()>40){
                System.out.println(persArr[i]);
            }

        }
    }

}
