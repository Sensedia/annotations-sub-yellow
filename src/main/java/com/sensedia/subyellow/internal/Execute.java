package com.sensedia.subyellow.internal;

import com.sensedia.subyellow.annotation.SubField;

import java.lang.reflect.Method;

/**
 * Created by renan on 11/10/15.
 */
public class Execute {

    public static void parseAs(Object obj, String text){
        try {
            for (Method metodo : obj.getClass().getDeclaredMethods()) {
                if (metodo.isAnnotationPresent(SubField.class)) {
                    SubField annotation = metodo.getAnnotation(SubField.class);
                    metodo.invoke(obj,text.substring(annotation.starCopy(),annotation.endCopy()));
                }
            }
        } catch (Exception e) {
            System.out.println("Erro + "+e.getMessage());
        }
    }

}
