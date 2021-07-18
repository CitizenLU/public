package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class IsValidTest {

    @Test
    public void isValid() {
        IsValid isValid = new IsValid();
        String s = "()";
        Assert.assertTrue(isValid.isValid(s));
    }
}