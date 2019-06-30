import java.util.Scanner;

public class DoWhile {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5");
        int value = scanner.nextInt();
        while(value!=5) {
            System.out.println("Enter 5");
            value = scanner.nextInt();
        }
        System.out.println("You enter 5");
    }
}

//TERMINAL OUTPUT:
//Enter 5

//5
//You enter 5
