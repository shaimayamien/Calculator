

import Calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class caltest {
    @Test
    public void caltest() {
        assertEquals("error in add(_)", 3,Calculator.add(1, 2));
        assertEquals("error in add(_)", -3,Calculator.add(-1, -2));
        assertEquals("error in add(_)", 9,Calculator.add(9, 0));
    }
      public void calTestFail(){
          assertEquals("error in add(_)", 0,Calculator.add(1, 2));
      }
       
        
        
        
        
        
    }
    
