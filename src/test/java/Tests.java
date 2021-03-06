
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
            assertEquals(10, calc.add(7, 3));
        }

        @Test
        //Test case by Trayi Chaganti
        public void testSub() {
            assertEquals(1, calc.sub(4, 3));
        }
        @Test
        //Test case by Bhavya Yaddula
        public void testDiv() {
            assertEquals(1, calc.div(9, 9));
        }

    }


