
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class Tests {
        public static Calc calc;

        @BeforeClass
        public static void setup() {
            calc = new Calc();
        }

        @Test
        //Test case by ankhit
        public void testAdd() {
            assertEquals(5, calc.add(2, 3));
        }
    }

