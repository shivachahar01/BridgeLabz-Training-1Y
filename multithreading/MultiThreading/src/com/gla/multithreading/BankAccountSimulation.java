package com.gla.multithreading;
    class BankAccount implements Runnable
    {

        private String accountHolderName;
        private String accountType;

        public BankAccount(String name, String type)
        {
            this.accountHolderName = name;
            this.accountType = type;
        }

        @Override
        public void run()
        {
            Thread t = Thread.currentThread();
            for (int i = 1; i <= 3; i++)
            {
                System.out.println("User: "+accountHolderName+" | Type: "+accountType+" | Priority: "+t.getPriority()+" | Checking balance... ("+ i+ ")");

                try
                {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e)
                {
                    System.out.println("Thread interrupted");
                }
            }
        }
    }

    public class BankAccountSimulation
    {
        public static void main(String[] args)
        {
            BankAccount premiumUser = new BankAccount("Akshat", "Premium");
            BankAccount regularUser = new BankAccount("Shikhar", "Regular");
            BankAccount basicUser = new BankAccount("Arjun", "Basic");
            Thread t1 = new Thread(premiumUser);
            Thread t2 = new Thread(regularUser);
            Thread t3 = new Thread(basicUser);
            t1.setPriority(10);
            t2.setPriority(5);
            t3.setPriority(1);
            t1.start();
            t2.start();
            t3.start();
        }
    }
