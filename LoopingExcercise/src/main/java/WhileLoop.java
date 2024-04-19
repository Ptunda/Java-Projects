

public class WhileLoop {

    public static void main(String[] args) throws InterruptedException {

        // create a while loop that prints "I love Java" five times
        int i = 1;

        while(i < 6){

            int numberOfTimes = i; // number of times you will be printing
            System.out.printf("%d. I love Java.\n", numberOfTimes);
            i++;

            // add wait period every time you execute
            Thread.sleep(1000);

        }

    }

}
