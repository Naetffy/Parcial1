package edu.eci.cvds.tdd;

import org.junit.Assert;
import org.junit.Test;

public class AgeTest {
    private  AgeValidator validator = new AgeValidator();

    @Test
    public void underAge() throws AgeException {
        boolean result = validator.underAge(0);
        Assert.assertTrue(result);
        result = validator.underAge(17);
        Assert.assertTrue(result);
    }
    @Test
    public void invalidAge() throws AgeException {
        try{
            boolean result = validator.underAge(-1);
            Assert.fail("Invalid age");
        }
        catch( AgeException e){
            Assert.assertEquals(e.getMessage(),AgeException.invalidAge);

        }
        try{
            boolean result = validator.underAge(-20000);
            Assert.fail("Invalid age");
        }
        catch (AgeException e){
            Assert.assertEquals(e.getMessage(),AgeException.invalidAge);
        }
        try{
            boolean result = validator.underAge(20000);
            Assert.fail("Invalid age");
        }
        catch (AgeException e){
            Assert.assertEquals(e.getMessage(),AgeException.invalidAge);
        }
        try{
            boolean result = validator.underAge(136);
            Assert.fail("Invalid age");
        }
        catch (AgeException e){
            Assert.assertEquals(e.getMessage(),AgeException.invalidAge);
        }

    }
    @Test
    public void notUnderAge() throws AgeException {
        boolean result = validator.underAge(18);
        Assert.assertFalse(result);
        result = validator.underAge(130);
        Assert.assertFalse(result);
    }

}