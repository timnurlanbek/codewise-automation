package codewise_automation.guru;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Buy {

    public String getInitial(String fullName) {
        fullName = fullName.trim();
        String arr [] = fullName.split(" ");

        if (fullName.isEmpty()) {
            return null;
        }
        else if (arr.length != 2) {
            return null;
        }

        String initial = String.valueOf(arr[0].charAt(0)) + arr[1].charAt(0);
        return initial.toUpperCase();
    }

    @Test

    public void test1() {

        String actualResult = getInitial("John  Doe");
        String expectedResult = getInitial(null);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test2() {
        String actualResult = getInitial("John");
        Assert.assertNull(actualResult);
    }

    @Test
    public void test3() {
        Assert.assertEquals("JD", getInitial("john doe"));
    }

    @Test
    public void test4() {
        String result = getInitial("Cristiano Ronaldo Junior");
        Assert.assertNull(result);
    }






}
