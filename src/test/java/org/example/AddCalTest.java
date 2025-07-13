package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AddCalTest {

    @Test
    void twoplus4()
    {
        var obj = new AddCal();
        assertEquals(4,obj.add(2,2));
    }

    @Test
    void fourfourpluseight()
    {
        var obj = new AddCal();
       assertEquals(8,obj.add(4,4));
    }

}
