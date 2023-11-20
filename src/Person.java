public class Person {
    String name;
    int age;
    String address;


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("address:" + address);
    }

    public static void main(String[] args) {
        Person person1 = new Person("rebeka", 20, "oradea");
        Person person2 = new Person("paula", 20, "oradea");


        System.out.println("Person1:");
        person1.displayInfo();

        System.out.println("Person2:");
        person2.displayInfo();
    }
}


