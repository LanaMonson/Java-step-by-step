import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter something");
        String string = s.nextLine();
        System.out.println("you enter "+string);

    }
}

//TERMINAL OUTPUT:
//Enter something

//--I Entered "Hello"
// Hello

//TERMINAL OUTPUT:
//you enter  Hello
