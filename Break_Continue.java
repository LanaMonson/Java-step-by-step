//BREAK
public class Break_Continue {
    public static void  main(String[] args) {
        int i = 0;
        while(true) {
            if(i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Cycle has complete");
    }
}


//CONTINUE
public class Break_Continue {
    public static void  main(String[] args) {
        for(int i = 0; i<=15; i++){
            if( i%2 ==0){
                continue;
            }
            System.out.println("This is odd number"+i);
        }
    }
}
//TERMINAL OUTPUT:
// This is odd number1
// This is odd number3
// This is odd number5
// This is odd number7
// This is odd number9
// This is odd number11
// This is odd number13
// This is odd number15
