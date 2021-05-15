package org.example.leetcode;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsValidTest {

    @Test
    public void isValid() {
        IsValid isValid = new IsValid();
        String s = "()";
        Assert.assertTrue(isValid.isValid(s));
    }
}