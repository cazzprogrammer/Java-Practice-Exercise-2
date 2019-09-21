package main.java.com.stackroute.PE_exercise2;
public class Program2
{
    public Boolean powerOfFour(double number)
    {
        double i = Math.log(number)/Math.log(4);
        if(i == Math.floor(i))
            return true;
        else
            return false;
    }
}
