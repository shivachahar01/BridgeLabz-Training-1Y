package com.gla.multithreading;
class ExamTask implements Runnable
{
    private String taskName;
    private int startDelay;
    private int duration;
    public ExamTask(String taskName, int startDelay, int duration)
    {
        this.taskName = taskName;
        this.startDelay = startDelay;
        this.duration = duration;
    }
    @Override
    public void run()
    {
        try
        {
            System.out.println(taskName+" thread state: "+Thread.currentThread().getState());
            Thread.sleep(startDelay * 1000);
            System.out.println(taskName+" STARTED by "+Thread.currentThread().getName());
            for (int i=1;i<=duration;i++)
            {
                System.out.println(taskName + " in progress... ("+i+" sec)");
                Thread.sleep(1000);
            }
            System.out.println(taskName + " COMPLETED by "+Thread.currentThread().getName());
        }
        catch (InterruptedException e)
        {
            System.out.println(taskName + " interrupted!");
        }
    }
}

public class UniversityExamHallManagement
{
    public static void main(String[] args)
    {
        ExamTask entry = new ExamTask("Student Entry Monitoring", 0, 5);
        ExamTask questionPaper = new ExamTask("Question Paper Distribution", 5, 3);
        ExamTask attendance = new ExamTask("Attendance Marking", 10, 4);
        ExamTask collection = new ExamTask("Answer Sheet Collection", 15, 3);
        Thread t1 = new Thread(entry, "Entry-Thread");
        Thread t2 = new Thread(questionPaper, "QuestionPaper-Thread");
        Thread t3 = new Thread(attendance, "Attendance-Thread");
        Thread t4 = new Thread(collection, "Collection-Thread");
        t2.setPriority(10);
        t3.setPriority(8);
        t4.setPriority(7);
        t1.setPriority(5);
        System.out.println("Initial Thread States:");
        System.out.println("Entry: " + t1.getState());
        System.out.println("Question Paper: " + t2.getState());
        System.out.println("Attendance: " + t3.getState());
        System.out.println("Collection: " + t4.getState());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try
        {
            while (t1.isAlive()||t2.isAlive()||t3.isAlive()||t4.isAlive())
            {
                System.out.println("\n--- Thread States ---");
                System.out.println("Entry: " + t1.getState());
                System.out.println("Question Paper: " + t2.getState());
                System.out.println("Attendance: " + t3.getState());
                System.out.println("Collection: " + t4.getState());

                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("\nAll activities completed successfully!");
    }
}
