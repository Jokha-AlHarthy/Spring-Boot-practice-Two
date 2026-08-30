package com.example.demo.utils;

public class HelperUtils {
    public static String compare(String original, String update){
        if(update==null){
            return original;
        }
        return original != null && original.equals(update) ? original : update;
    }

    public static Integer compare(Integer original, Integer update){
        if(update==null){
            return original;
        }
        return original != null && original.equals(update) ? original : update;
    }
}
