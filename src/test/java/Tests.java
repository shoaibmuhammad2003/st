
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
        //Test case by Ankhit Tangella
        public void testAdd() {
            assertEquals(11, calc.add(7, 3));
        }
    }

