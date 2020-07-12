package acadamy.learnprogramming;

/**
 * java doc comments are slash starstar
 */
public class Main {
    //use PSVM for short to generate main
//    control+/ will comment stuff out quickly
    /*
        multiline comments
        are done
        with star slash

     */
    public static void main(String[] args) {
        System.out.println("args-size = "+ args.length);
    /*
        multiline comments
        are done
        with star slash

     */
        // add arguements from Main edit configuration
        for (int i = 0; i < args.length; i++) {
            System.out.println("args [ " + i + " ] = "+ args[i]);
        }


        //creating an object
        Person sam = new Person();
        sam.setFirstName("Sam");
        sam.setLastName("Rodriguez");
        sam.setAge(26);
        System.out.println(sam.getFirstName() + " " + sam.getLastName() + " is " + sam.getAge()+" years old");
    }

    /**
     *
     * @param a operand
     * @param b operand
     * @return sum of a and b
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
