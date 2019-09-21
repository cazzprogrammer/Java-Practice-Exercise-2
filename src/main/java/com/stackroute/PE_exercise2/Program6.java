package main.java.com.stackroute.PE_exercise2;

public class Program6 {

    public void intFactorial()
    {
        int initial = 1, recent = 1, pre = 1;
        while(true)
        {
            System.out.println("The Factorial of "+ initial + " is "+ recent);
            initial++;
            recent = pre*initial;
            if(pre != recent/initial)
            {
                break;
            }
        }
        System.out.println("The Factorial of "+ initial + " is out of range");
    }

    public void longFactorial()
    {
        long initial = 1, recent = 1, pre = 1;
        while(true)
        {
            System.out.println("The Factorial of "+ initial + " is "+ recent);
            initial++;
            recent = pre*initial;
            if(pre != recent/initial)
            {
                break;
            }
        }
        System.out.println("The Factorial of "+ initial + " is out of range");
    }
}
