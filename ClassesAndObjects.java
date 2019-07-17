public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 50;
        System.out.println("My name is "+ person1.name + " and I'm " + person1.age+" years old");
        Person person2 = new Person();
        person2.name = "Jane Smith";
        person2.age = 20;
        System.out.println("My name is "+ person2.name + " and I'm " + person2.age+" years old");
    }
}

class Person{
    String name;
    int age;
}
//TERMINAL OUTPUT:
//My name is John Doe and I'm 50 years old
//My name is Jane Smith and I'm 20 years old
