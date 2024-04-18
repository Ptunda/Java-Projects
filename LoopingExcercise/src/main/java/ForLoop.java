
public class ForLoop {

    public static void main(String[] args) throws InterruptedException {

        // count down from 10
        int count = 10;

        System.out.println("Count Down: ");

        for(int i = 0; i <= 10; i++){

            System.out.println(count - i + ".");
            Thread.sleep(1000);
        }

        // add wait period every time you execute
        System.out.println("Launch!!!");

    }

}
