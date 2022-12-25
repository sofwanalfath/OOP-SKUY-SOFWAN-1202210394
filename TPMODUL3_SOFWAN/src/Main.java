import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant order = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.println("Please Input Customer ID         : ");
            customerID = input.nextInt();

            System.out.println("Please Input Your Order Quantity : ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(order);
            Waiters pelayan = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(pelayan);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Please Use Integer!!! (1/2/3,etc)");
        }

    }

}
