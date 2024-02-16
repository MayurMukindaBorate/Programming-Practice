class Demo extends Thread
{
    public void run()
    {

    }
}
class Multi3
{
    public static void main(String Arg[])
    {
        System.out.println("Current thread is : "+Thread.currentThread().getName());
        Demo obj1 = new Demo();     \\New state

        obj1.start();   // Runnable state

        System.out.println("Thread goes to dead state");    // Dead state
    }
}