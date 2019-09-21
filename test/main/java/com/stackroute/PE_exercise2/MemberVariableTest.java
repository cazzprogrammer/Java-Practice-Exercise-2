package main.java.com.stackroute.PE_exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    private MemberVariable memberVariable;
    @Before
    public void setUp()  {
        memberVariable = new MemberVariable();
    }

    @After
    public void tearDown()  {
        memberVariable = null;
    }
    private Program1 program1;

    @Before


    @Test
    public void checkPowerOfFour()
    {
        assertEquals("Member Name: Dipankar Potter Member age: 22 Member salary: 60000.0",memberVariable.setvalues("Dipankar",22,60000));


    }

}