
package racinecarre;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jake
 */
public class SqrtTest {
    
    public SqrtTest() {
    }

     @Test
    public  void  test1() {
        
        System.out.println("Output TEST");
        Sqrt  sqrt = new  Sqrt ();

        assertTrue(sqrt.solveSQRT(7)>=0);
        assertTrue(sqrt.solveSQRT(115)>=0);
        assertTrue(sqrt.solveSQRT(2007)>=0);
    }
    @Test
    public  void  test2() {
        System.out.println("Precision TEST");
        double epsilon=0.000001;
        Sqrt  sqrt = new  Sqrt ();

        assertEquals(sqrt.solveSQRT(7),Math.sqrt(7),epsilon);
    }
    @Test
    public void test3(){
        System.out.println("Input between 0 and 1 TEST");
        Sqrt  sqrt = new  Sqrt ();
        double val=0.5;
        double rac1=sqrt.solveSQRT(val);
        assertTrue(val<rac1);
        assertTrue(rac1<1);
    }
    public void test4(){
        System.out.println("Input greater than 1 TEST");
        Sqrt  sqrt = new  Sqrt ();
        double val=90;
        double rac1=sqrt.solveSQRT(val);
        assertTrue(1<rac1);
        assertTrue(rac1<val);
    }
    @Test
    public void test5(){
        System.out.println("Boundary TEST");
        double epsilon=0.0;
        Sqrt sqrt = new Sqrt();
          assertEquals(sqrt.solveSQRT(0.),0.0,epsilon);
          assertEquals(sqrt.solveSQRT(1.),1.0,epsilon);
          
    }
    @Test (timeout=10)
    public void test6(){
        System.out.println("Big value TEST");
         Sqrt sqrt = new Sqrt();
         double epsilon=0.000001;
         assertEquals(sqrt.solveSQRT(1.0e10),1.0e5,epsilon);
    }
    @Test (expected=IllegalArgumentException.class)
    public void test7(){
        System.out.println("Invalid input TEST");
         Sqrt sqrt = new Sqrt();
         sqrt.solveSQRT(-1);
        
    }
    
}
