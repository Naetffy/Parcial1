package edu.eci.cvds.tdd;

import org.junit.Assert;
import org.junit.Test;

public class AgeTest {
    private  AgeValidator validator = new AgeValidator();

    @Test
    public void underAge() {
        boolean result = validator.underAge(0);
        Assert.assertEquals(true,result);
        result = validator.underAge(17);
        Assert.assertEquals(true,result);
    }
    @Test
    public void ivalidAge() {
        boolean result = validator.underAge(-1);
        Assert.assertEquals(false,result);
        result = validator.underAge(-20000);
        Assert.assertEquals(boolean,result);
    }
    @Test
    public void notUnderAge() {
        boolean result = validator.underAge(18);
        Assert.assertEquals(true,result);
        result = validator.underAge(20000);
        Assert.assertEquals(true,result);
    }

}