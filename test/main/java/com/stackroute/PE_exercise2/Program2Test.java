package main.java.com.stackroute.PE_exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Program2Test {

    private Program2 program2;
    @Before
    public void setUp()  {
        program2 = new Program2();
    }

    @After
    public void tearDown()  {
        program2 = null;
    }
    private Program1 program1;

    @Before


    @Test
    public void checkPowerOfFour()
    {
        assertEquals(true,program2.powerOfFour(64));
        assertEquals(false,program2.powerOfFour(45));

    }


}