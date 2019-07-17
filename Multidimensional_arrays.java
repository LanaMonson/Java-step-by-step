public class Multidimensional_arrays {
    public static void main(String[] args){
        int[] number = {1,2,3};

        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);
    }
}

//TERMINAL OUTPUT:
//9
//4


public class Multidimensional_arrays {
    public static void main(String[] args){
        int[] number = {1,2,3};

        int[][] matrix = {{1,2,3,4,5},
                          {4},
                          {7,8,9}};

        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][4]);

        int[] number1 = new int[5];
    }
}
//TERMINAL OUTPUT:
//9
//4
//5


public class Multidimensional_arrays {
    public static void main(String[] args){
        int[] number = {1,2,3};

        int[][] matrix = {{1,2,3,4,5},
                          {4},
                          {7,8,9}};

        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][4]);

        int[] number1 = new int[5];

        String[][] strings= new String[2][3];
        strings[0][1]= "Hello";
        System.out.println(strings[0][1]);
    }
}
//TERMINAL OUTPUT:
//9
//4
//5
//Hello
