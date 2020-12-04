public class Person {
    private String name;
    private String position;
    private String mail;
    private String tel;
    private int salary;
    private int age;

    public Person() {
    }

    public Person(String name, String position, String mail, String tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", tel='" + tel + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
