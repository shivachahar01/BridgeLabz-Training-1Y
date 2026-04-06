package com.gla.multithreading;
    import java.time.LocalTime;
    class Device implements Runnable
    {
        private String deviceName;
        private int interval;
        public Device(String deviceName, int interval)
        {
            this.deviceName = deviceName;
            this.interval = interval;
        }
        @Override
        public void run()
        {
            Thread t = Thread.currentThread();
            for (int i = 1; i <= 5; i++)
            {
                System.out.println("Time: "+LocalTime.now()+" | Device: "+deviceName+" | Priority: "+t.getPriority()+" | Cycle: "+i);
                try
                {
                    Thread.sleep(interval * 1000);
                }
                catch (InterruptedException e)
                {
                    System.out.println(deviceName + " interrupted");
                }
            }

            System.out.println(deviceName + " finished execution.");
        }
    }
    public class SmartHomeAutomation
    {
        public static void main(String[] args)
        {
            Device tempSensor = new Device("Temperature Sensor", 5);
            Device securityCam = new Device("Security Camera", 3);
            Device lightCtrl = new Device("Light Controller", 4);
            Device doorLock = new Device("Door Lock Monitor", 6);
            Thread t1 = new Thread(tempSensor);
            Thread t2 = new Thread(securityCam);
            Thread t3 = new Thread(lightCtrl);
            Thread t4 = new Thread(doorLock);
            t2.setPriority(10);
            t1.setPriority(7);
            t3.setPriority(5);
            t4.setPriority(5);
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            try
            {
                t1.join();
                t2.join();
                t3.join();
                t4.join();
            }
            catch (InterruptedException e)
            {
                System.out.println("Main thread interrupted");
            }
            System.out.println("All devices completed. Smart Home shutting down.");
        }
    }
