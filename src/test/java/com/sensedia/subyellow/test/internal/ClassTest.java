package com.sensedia.subyellow.test.internal;

import com.sensedia.subyellow.annotation.SubField;

/**
 * Created by renan on 29/10/15.
 */
public class ClassTest {


    private String value1;
    private String value2;

    public ClassTest(){
        this.value1 = "";
        this.value2 = "";
    }

    public String getValue1() {
        return value1;
    }

    @SubField(starCopy = 0, endCopy = 2)
    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    @SubField(starCopy = 2, endCopy = 6)
    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "ClassTest{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                '}';
    }
}
