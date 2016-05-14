package com.woopt.api.common;


import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.util.Hashtable;


public class Updater {
    
    private static final Logger LOGGER = Logger.getLogger(Updater.class.getName());
    
    public static <E> E updater(E oldEntity, E newEntity) {

        Field[] newEntityFields = newEntity.getClass().getDeclaredFields();
        Hashtable newHT = fieldsToHT(newEntityFields, newEntity);

        Class oldEntityClass = oldEntity.getClass();
        Field[] oldEntityFields = oldEntityClass.getDeclaredFields();

        for (Field field : oldEntityFields){
            field.setAccessible(true);
            Object o = newHT.get(field.getName());
            if (o != null){
                try {
                    Field f = oldEntityClass.getDeclaredField(field.getName());
                    f.setAccessible(true);
                    LOGGER.info("setting " + f.getName() + "====" + o);
                    f.set(oldEntity, o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }

        }

        return oldEntity;
    }

    
    private static Hashtable<String, Object> fieldsToHT(Field[] fields, Object obj){
        Hashtable<String,Object> hashtable = new Hashtable<>();
        for (Field field: fields){
            field.setAccessible(true);
            try {
                Object retrievedObject = field.get(obj);
                if (retrievedObject != null){
                    LOGGER.info("scanning " + field.getName());
                    hashtable.put(field.getName(), field.get(obj));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return hashtable;
    }
}