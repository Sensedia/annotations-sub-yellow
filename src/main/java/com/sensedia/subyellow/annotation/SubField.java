package com.sensedia.subyellow.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by renanpetronilho on 11/10/15.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SubField {
    public abstract int starCopy() default 0;
    public abstract int endCopy() default 0;
}
