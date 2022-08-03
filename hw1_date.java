package lesson1.hw1;

import homeW1.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class hw1_date {
    @Test
    public void TestDate(){

        Date dat = new Date(1999,12,9);
        assertEquals("1999-12-09", dat.toString());
    }

}
