
public class ForLoop {

    public static void main(String[] args) throws InterruptedException {

        // count down from 10
        int count = 10;

        System.out.println("\nCount Down: ");

        // reduce the value of count every time you execute this block
        for(int i = 0; i < 10; i++){

            System.out.print("   "); // add a tab for readability
            System.out.println(count - i); // count down every time you execute this block of code
            Thread.sleep(1000);// add a wait period every time you execute

        }

        // print "Launch" when the count-down is done
        System.out.println("Launch!!!");

    }

}
