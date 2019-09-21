package main.java.com.stackroute.PE_exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student();
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Test
    public void recordOfStudent()
    {
        int arr[] = {12,-22,11};
        int arr1[] = {12,22,11};
        assertEquals("Grades Should be between 0 and 100 inclusive",student.takeinput(3,arr));
        assertEquals("Array length doesn't match the input",student.takeinput(111,arr));
        assertEquals("Grades Should be between 0 and 100 inclusive",student.takeinput(3,arr));
    }
}