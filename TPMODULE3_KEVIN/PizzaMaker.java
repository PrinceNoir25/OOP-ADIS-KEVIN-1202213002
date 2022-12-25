public class PizzaMaker implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int pizzaNumber = 1;

    @Override
    public void run() {
        while (true) {
            makePizza();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getPizzaNumber() {
        return pizzaNumber;
    }

    public void makePizza() {
        synchronized(PizzaMaker.lock) {
            if (this.waitingForPickup) {
                try {
                    System.out.println("Pizza Maker Waiting for the Waiter to deliver the pizza");
                    PizzaMaker.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            waitingForPickup = true;
            System.out.println("Pizza Maker  Making Pizza Number " + pizzaNumber++);
            PizzaMaker.lock.notifyAll();
            System.out.println("Pizza Maker Telling the waiter to get the pizza\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}
