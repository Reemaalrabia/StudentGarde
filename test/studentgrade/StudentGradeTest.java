/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class StudentGradeTest {
    
    public StudentGradeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

 // check if the grade was 90 it will gave use A 
    @Test
    public void testGetGradeA() {
        assertEquals("A", StudentGrade.getGrade(90));
    }
    
    // check if we intered 101 if it is not A
    @Test
    public void testGetGradeNotA() {
        assertNotEquals("A", StudentGrade.getGrade(101));
    }
    
    // test grade B upper boundary
    @Test
    public void testGetGradeB() {
        assertEquals("B", StudentGrade.getGrade(89));
    }
    
    // test grade B lower boundary
    @Test
    public void testGetGradeB1() {
        assertEquals("B", StudentGrade.getGrade(80));
    }
    
    // test F grade
    @Test
    public void testGetGradeF() {
        assertEquals("F", StudentGrade.getGrade(79));
    }
    
    // test grade 0
    @Test
    public void testGetGradeF1() {
        assertEquals("F", StudentGrade.getGrade(0));
    }

}
