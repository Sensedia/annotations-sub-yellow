package com.sensedia.subyellow.test.internal;

import com.sensedia.subyellow.internal.Execute;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by renan on 29/10/15.
 */
public class ExecuteTest {

    @Test
    public void parseAsTest(){
        String text = "01text";
        ClassTest test = new ClassTest();
        Execute.parseAs(test, text);
        System.out.println(test);
        Assert.assertEquals("01",test.getValue1());
        Assert.assertEquals("text",test.getValue2());
    }


}
