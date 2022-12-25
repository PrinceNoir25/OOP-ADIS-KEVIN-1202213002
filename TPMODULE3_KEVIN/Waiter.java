public class Waiter implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int pizzaPrice = 70000;

    public Waiter(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }



    @Override
    public void run() {
        while (true) {
            getPizza();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Pizza: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * pizzaPrice);
        System.out.println("==========================================================");
    }

    public void getPizza() {
        synchronized(PizzaMaker.getLock()) {

            System.out.println("Waiter: Pizza is ready to deliver");
            PizzaMaker pizzaMachine = new PizzaMaker();
            pizzaMachine.setWaitingForPickup(false);

            if (PizzaMaker.getPizzaNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            PizzaMaker.getLock().notifyAll();
            System.out.println("Waiter: Tell the pizza maker to make another pizza\n");

        }
    }
}
