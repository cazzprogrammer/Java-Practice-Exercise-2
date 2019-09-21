package main.java.com.stackroute.PE_exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Program1Test {

    private Program1 program1;

    @Before
    public void setUp()
    {
        program1 = new Program1();

    }
    @After
    public void tearDown(){
        program1 = null;

    }

    @Test
    public void checkPalindrome()
    {
        assertEquals(true,program1.isPalindrome("madam"));
        assertEquals(false,program1.isPalindrome("mallu"));

    }


}