public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 50;
        System.out.println("My name is "+ person1.name + "and I'm " + person1.age+" years old");
        Person person2 = new Person();
        person2.name = "Jane Smith";
        person2.age = 20;

    }
}

class Person{
    String name;
    int age;
}
