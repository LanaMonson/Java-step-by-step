//import java.util.Scanner;

//public class Switch {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the age");
//        int age = scanner.nextInt();
//        if(age == 10){
//            System.out.println("You are schoolkid");
//        }else if(age == 19){
//            System.out.println("You are student");
//        }
//    }
//}

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        switch(age){
            case 0:
                System.out.println("You just born");
                break;
            case 7:
                System.out.println("you are schoolkid");
                break;
            case 19:
                System.out.println("You are student");
                break;
            default:
                System.out.println("Does not match the parameters");
        }
    }
}

// TERMINAL OUTPUT:
//Enter the age
//7
//you are schoolkid


