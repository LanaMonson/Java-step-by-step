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



public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Richard Roe";
        person1.age = 45;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Jane Doe";
        person2.age = 27;
        person2.speak();
    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is "+ name + " and I'm " + age+" years old");
    }
}
//TERMINAL OUTPUT:
//My name is Richard Roe and I'm 45 years old
//My name is Jane Doe and I'm 27 years old


public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Richard Roe";
        person1.age = 45;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Jane Doe";
        person2.age = 27;

    }
}

class Person{
    String name;
    int age;

    void speak(){
        for(int i = 0; i<3; i++){
        System.out.println("My name is "+ name + " and I'm " + age+" years old");
        }
    }
}
//TERMINAL OUTPUT:
//My name is Richard Roe and I'm 45 years old
//My name is Richard Roe and I'm 45 years old
//My name is Richard Roe and I'm 45 years old

public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Richard Roe";
        person1.age = 45;
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Jane Doe";
        person2.age = 27;
        person2.speak();
        person2.sayHello();
    }
}

class Person{
    String name;
    int age;

    void speak(){
        for(int i = 0; i<3; i++){
        System.out.println("My name is "+ name + " and I'm " + age+" years old");
        }
    }
    void sayHello(){
        System.out.println("Hi!");
    }
}
//TERMINAL OUTPUT:
//Hi!
//My name is Jane Doe and I'm 27 years old
//My name is Jane Doe and I'm 27 years old
//My name is Jane Doe and I'm 27 years old
//Hi!


public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Richard Roe";
        person1.age = 45;

        Person person2 = new Person();
        person2.name = "Jane Doe";
        person2.age = 27;
        person1.calculateYearsToRetirement();
        person2.calculateYearsToRetirement();
    }
}

class Person{
    String name;
    int age;

    void calculateYearsToRetirement(){
        int years = 65-age;
        System.out.println(years+" years left until retirement");
    }

    void speak(){
        for(int i = 0; i<3; i++){
        System.out.println("My name is "+ name + " and I'm " + age+" years old");
        }
    }
    void sayHello(){
        System.out.println("Hi!");
    }
}
//TERMINAL OUTPUT:
//20 years left until retirement
//38 years left until retirement
