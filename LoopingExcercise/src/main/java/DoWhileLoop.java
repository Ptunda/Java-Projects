

public class DoWhileLoop {

    public static void main(String[] args) throws InterruptedException {

        int i = 1;

        System.out.println(); // creating an empty line/space when we print on the console pane

        // do while loop that prints "I love Java" five times
        do {

            System.out.print("   "); // adding a tab every time we print "I love Java."
            int numberOfTimes = i; // number of times you will be printing
            System.out.printf("%d. I love Java.\n", numberOfTimes);
            i++;

            // add wait period every time you execute
            Thread.sleep(1000);

        }while (i < 6);

    }
}
