package com.gla.multithreading;
import java.util.*;
class Ticket extends Thread
{
    int id;
    String type;
    int priority;
    int queuePos;
    static long totalTime = 0;
    static long sum10 = 0, count10 = 0;
    static long sum4 = 0, count4 = 0;
    static long sum2 = 0, count2 = 0;
    static long sum1 = 0, count1 = 0;
    Ticket(int id,String type,int priority,int queuePos)
    {
        this.id = id;
        this.type = type;
        this.priority = priority;
        this.queuePos = queuePos;
        this.setPriority(priority);
    }
    public void run()
    {
        try
        {
            Random r = new Random();
            int time = r.nextInt(5) + 1;
            long start = System.currentTimeMillis();
            System.out.println("START -> Ticket "+id+" | Type: "+type+" | Agent: "+getName()+" | Priority: "+priority+ " | Queue: "+queuePos);
            Thread.sleep(time * 1000);
            long end = System.currentTimeMillis();
            long duration = (end - start) / 1000;
            synchronized (Ticket.class)
            {
                totalTime += duration;
                if (priority == 10)
                {
                    sum10 += duration; count10++;
                }
                else if (priority == 4)
                {
                    sum4 += duration; count4++;
                }
                else if (priority == 2)
                {
                    sum2 += duration; count2++;
                }
                else if (priority == 1)
                {
                    sum1 += duration; count1++;
                }
            }

            System.out.println("END   -> Ticket "+id+" | Type: "+type+" | Time: "+duration+" sec");
        } catch (Exception e) {

        }
    }
}

public class CustomerSupportTicketingSystem {
    public static void main(String[] args) throws Exception
    {

        Ticket[] tickets = {
                new Ticket(1, "Critical Bug", 10, 1),
                new Ticket(2, "Feature Request", 4, 5),
                new Ticket(3, "General Query", 2, 7),
                new Ticket(4, "Feedback", 1, 9),
                new Ticket(5, "Critical Bug", 10, 2),
                new Ticket(6, "Feature Request", 4, 6),
                new Ticket(7, "General Query", 2, 8),
                new Ticket(8, "Critical Bug", 10, 3),
                new Ticket(9, "Feedback", 1, 10),
                new Ticket(10, "Critical Bug", 10, 4)
        };
        Arrays.sort(tickets, (a, b) -> b.priority - a.priority);
        for (Ticket t : tickets)
        {
            t.start();
        }
        for (Ticket t : tickets)
        {
            t.join();
        }
        System.out.println("\nTotal Processing Time: " + Ticket.totalTime + " sec");
        System.out.println("\nAverage Time per Priority:");
        if (Ticket.count10 > 0)
            System.out.println("Priority 10 -> " + (Ticket.sum10 / Ticket.count10) + " sec");
        if (Ticket.count4 > 0)
            System.out.println("Priority 4 -> " + (Ticket.sum4 / Ticket.count4) + " sec");
        if (Ticket.count2 > 0)
            System.out.println("Priority 2 -> " + (Ticket.sum2 / Ticket.count2) + " sec");
        if (Ticket.count1 > 0)
            System.out.println("Priority 1 -> " + (Ticket.sum1 / Ticket.count1) + " sec");
    }
}
