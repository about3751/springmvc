package com.lc.demo.converter;

import org.springframework.core.convert.converter.Converter;

import java.util.Date;

/**
 * Created by leich on 2017/3/26.
 */
public class CustomDateConverter implements Converter<String,Date> {
    public Date convert(String s) {
        return null;
    }
}
