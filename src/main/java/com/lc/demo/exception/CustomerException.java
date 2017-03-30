package com.lc.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by leich on 2017/3/29.
 * 全局异常处理
 */
@ControllerAdvice
public class CustomerException {


    @ExceptionHandler(value = {Exception.class})
    public ModelAndView allException(Exception ex)
    {
        ModelAndView modelAndView = new ModelAndView("exception");
        modelAndView.addObject("ex",ex);
        return modelAndView;
    }

}
