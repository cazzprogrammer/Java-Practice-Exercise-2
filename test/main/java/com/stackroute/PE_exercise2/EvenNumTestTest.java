package main.java.com.stackroute.PE_exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    private EvenNumTest evenNumTest;
    @Before
    public void setUp() throws Exception {
        evenNumTest = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        evenNumTest = null;
    }

    @Test
    public void checkEven()
    {
        assertEquals(true,evenNumTest.isEven(22));
        assertEquals(false,evenNumTest.isEven(23));
    }
}