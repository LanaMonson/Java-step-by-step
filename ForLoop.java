public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++) {
            System.out.println("Hello " +i);   // i++ ==  i = i+1 (true)
        }
    }
}

//TERMINAL OUTPUT:
///Library/Java/JavaVirtualMachines/jdk-11.0.2.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=62070:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/svetlanamonson/projects/java-steps/out/production/cycle ForLoop
//Hello 0
//Hello 1
//Hello 2
//Hello 3
//Hello 4
//Hello 5
//Hello 6
//Hello 7
//Hello 8
//Hello 9
//Hello 10


public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i = i+5) {
            System.out.println("Hello " +i);   // i++ ==  i = i+1 (true)
        }
    }
}

//TERMINAL OUTPUT:
//Hello 0
//Hello 5
//Hello 10


public class ForLoop {
    public static void main(String[] args) {
        for(int i = 10; i>=0; i = i-5) {
            System.out.println("Hello " +i);   // i++ ==  i = i+1 (true)
        }
    }
}

//TERMINAL OUTPUT:
//Hello 10
//Hello 5
//Hello 0
