import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PizzaMaker machine = new PizzaMaker();
        int customerID, orderQty;
        try {

            System.out.println("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.println("Enter how much pizza to made: ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(machine);
            Waiter waiter = new Waiter(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }

    }

}

