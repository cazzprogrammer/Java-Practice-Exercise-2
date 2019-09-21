package main.java.com.stackroute.PE_exercise2;

public class Program1 {

    public Boolean isPalindrome(String word)
    {
        StringBuffer string1 = new StringBuffer(word);
        StringBuffer string2 = new StringBuffer(word);
        string2.reverse();
        if(string1.toString().equals(string2.toString()))
          return true;
        else
            return false;
    }
}
