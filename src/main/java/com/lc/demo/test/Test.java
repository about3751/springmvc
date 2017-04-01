package com.lc.demo.test;

import com.lc.demo.entities.*;
import com.lc.demo.services.*;
import com.lc.demo.test.test_interface.Java8Test;
import com.lc.demo.test.test_interface.TestJava8;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Created by leich on 2017/3/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springmvc.xml")
public class Test {


    @Autowired
    private TicketService ticketService;

    @Autowired
    private BookService bookService;

    @Autowired
    private RelationShipService relationShipService;

    @Autowired
    private CarService carService;

    @Autowired
    private PersonService personService;

    @Autowired
    private CustomerService customerService;

    @org.junit.Test
    public void test() {
        bookService.queryAll();
    }

    @org.junit.Test
    public void test1() {
        List<Relationship> relationShips = relationShipService.getAll();

        for (Relationship relationShip : relationShips) {
            System.out.println(relationShip.getId() + " -- " + relationShip.getBookId().getBookName() + " -- " + relationShip.getPersonId().getPersonName());
        }
    }

    /**
     * Car和Person 一对多查询
     */
    @org.junit.Test
    public void testCarOnToMany() {

        int cars = carService.addCar(new Car());
//            System.out.println(" C " + cars.getId() + " -- " +  cars.getCarName());
//            for (Person person : cars.getPersonList()) {
//                System.out.println(" P " + person.getId() + " -- " +  person.getPersonName());
//            }
    }


    @org.junit.Test
    public void test3() {
        List<Person> personList = personService.selectPersons();

        for (Person person : personList) {
            System.out.println(" P " + person.getId() + " -- " + person.getPersonName()

                    + " -- " + person.getCar().getCarName()

            );
        }

    }

    @org.junit.Test
    public void test4() {

        List<Car> cars = carService.queryAll();

        for (Car car : cars) {
            System.out.println(" C " + car.getId() + " -- " + car.getCarName());
            for (Person person : car.getPersonList()) {
                System.out.println(" P " + person.getId() + " -- " + person.getPersonName());

            }
        }

    }

    @org.junit.Test
    public void testOneToMany() {
        Customer customer = customerService.queryCustomerByName("小王");
        System.out.println(customer.getCustomerName());
        List<Ticket> tickets = customer.getTickets();
        for (Ticket ticket : tickets) {
            System.out.println(ticket.getAddress());
        }
    }

    @org.junit.Test
    public void testQueryAllTickets() {
        List<Ticket> tickets = ticketService.queryAllTikets();

        for (Ticket ticket : tickets) {
            System.out.println(ticket.getAddress() + " --- " + ticket.getCustomerId().getCustomerName());
        }
    }


    @org.junit.Test
    public void testLambda()
    {
        List<Book> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Book(i,"bookName"+i,new Date()));
        }
        list.forEach(
                book -> System.out.println(book.getBookName())
        );
        list.forEach(
                (Book book) -> {
                    System.out.println(book.getBookName());
                }
        );


        Java8Test java8Test = new Java8Test();
        java8Test.method();
        Book book = (Book) TestJava8.staticMethodFactory( Book::new );

        Person person = (Person) TestJava8.staticMethodFactory( Person::new );


        String baseStr = Base64.getUrlEncoder().encodeToString("http://www.baidu.com".getBytes());
        System.out.println(baseStr);
        String decodeStr = new String(Base64.getUrlDecoder().decode(baseStr),StandardCharsets.UTF_8);
        System.out.println(decodeStr);
    }

}

