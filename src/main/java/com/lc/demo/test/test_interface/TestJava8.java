package com.lc.demo.test.test_interface;

import com.lc.demo.entities.Book;
import com.lc.demo.entities.Car;
import com.lc.demo.entities.Person;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Created by leich on 2017/3/30.
 */
public interface TestJava8 {

    default void method()
    {
        System.out.println("default method");
    }

    static Object staticMethodFactory(Supplier<Object> objectSupplier)
    {
        return objectSupplier.get();
    }

}
