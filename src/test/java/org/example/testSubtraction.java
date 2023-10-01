package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSubtraction {
    Calc c = new Calc();
    void subtract(){
        assertEquals(2, c.subtract(4,2));
    }
}
