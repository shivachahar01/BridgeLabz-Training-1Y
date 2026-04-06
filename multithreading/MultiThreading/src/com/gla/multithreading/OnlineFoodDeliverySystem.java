package com.gla.multithreading;
class Order implements Runnable
{
    private int orderId;
    private String restaurantName;
    private int deliveryTime; // in seconds
    public Order(int orderId, String restaurantName, int deliveryTime)
    {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
    }
    @Override
    public void run()
    {
        try {
            long startTime = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName()+" picked up Order "+orderId+" from "+restaurantName);
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" is delivering Order "+orderId+" (In Transit)");
            Thread.sleep(deliveryTime*1000);
            System.out.println(Thread.currentThread().getName()+" delivered Order "+orderId);
            long endTime = System.currentTimeMillis();
            System.out.println("Total delivery time for Order "+orderId+": "+(endTime-startTime)/1000+" seconds\n");
        }
        catch (InterruptedException e)
        {
            System.out.println("Delivery interrupted for Order "+orderId);
        }
    }
}
public class OnlineFoodDeliverySystem
{
    public static void main(String[] args)
    {
        Order o1 = new Order(101, "Dominos", 3);
        Order o2 = new Order(102, "KFC", 5);
        Order o3 = new Order(103, "McDonalds", 7);
        Order o4 = new Order(104, "Pizza Hut", 4);
        Order o5 = new Order(105, "Burger King", 6);
        Thread t1 = new Thread(o1, "Agent-1");
        Thread t2 = new Thread(o2, "Agent-2");
        Thread t3 = new Thread(o3, "Agent-3");
        Thread t4 = new Thread(o4, "Agent-4");
        Thread t5 = new Thread(o5, "Agent-5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}