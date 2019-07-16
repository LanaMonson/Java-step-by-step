public class Arrays_of_strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0]=10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        
    }
}
//TERMINAL OUTPUT:
//10
//0


public class Arrays_of_strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0]=10;
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Hooray";
        strings[2] = "Java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
    }
}
//TERMINAL OUTPUT:
//Hello
//Java


public class Arrays_of_strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0]=10;
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Hooray";
        strings[2] = "Java";

        for(int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
//TERMINAL OUTPUT:
//Hello
//Hooray
//Java



public class Arrays_of_strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0]=10;
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Hooray";
        strings[2] = "Java";

        for(int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string: strings){
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x: numbers1){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);
    }
}
//TERMINAL OUTPUT:
//Hello
//Hooray
//Java
//
//6
