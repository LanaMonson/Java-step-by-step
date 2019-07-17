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



public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 57;

        Person person2 = new Person();
        person2.name = "Jane Smith";
        person2.age = 27;
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println(person1.name+" will retired in "+year1+ " years");
        System.out.println(person2.name+" will retired in "+year2+ " years");
    }
}

class Person{
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
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
//John Doe will retired in 8 years
//Jane Smith will retired in 38 years


public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("Eric Williams");
        person1.age = 57;

        Person person2 = new Person();
        person2.name = "Jane Smith";
        person2.age = 27;
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        person1.speak();
        System.out.println(person2.name+" will retired in "+year2+ " years");
    }
}

class Person{
    String name;
    int age;

    void setName(String username){
        name = username;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i = 0; i<2; i++){
        System.out.println("My name is "+ name + " and I'm " + age+" years old");
        }
    }
    void sayHello(){
        System.out.println("Hi!");
    }
}
//TERMINAL OUTPUT:
//My name is Eric Williams and I'm 57 years old
//My name is Eric Williams and I'm 57 years old
//Jane Smith will retired in 38 years



public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("Chris River");
        person1.age = 52;
        String s1 = "Thomas Willson";
        Person person2 = new Person();
        person2.setName(s1);
        person2.age = 33;
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        person1.speak();
        person2.speak();
    }
}

class Person{
    String name;
    int age;

    void setName(String username){
        name = username;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i = 0; i<2; i++){
        System.out.println("My name is "+ name + " and I'm " + age+" years old");
        }
    }
    void sayHello(){
        System.out.println("Hi!");
    }
}
// TERMINAL OUTPUT:
// My name is Chris River and I'm 52 years old
// My name is Chris River and I'm 52 years old
// My name is Thomas Willson and I'm 33 years old
// My name is Thomas Willson and I'm 33 years old
