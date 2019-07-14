public class Arrays {
    public static void main(String[] args) {
        int number = 10; //primitive variable //[10]
        int [] numbers = new int[5];     //numbers ->[arrays] reference variable
        for(int i = 0; i<numbers.length; i++){
            numbers[i] =  i*10;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
//TERMINAL OUTPUT:
//0
//10
//20
//30
//40


public class Arrays {
    public static void main(String[] args) {
        int number = 10; //primitive variable //[10]
        int [] numbers = new int[5];     //numbers ->[arrays] reference variable
        for(int i = 0; i<numbers.length; i++){
            numbers[i] =  i*10;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3};
        for(int i = 0; i<numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
    }
}
//TERMINAL OUTPUT:
//0
//10
//20
//30
//40

//1
//2
//3
