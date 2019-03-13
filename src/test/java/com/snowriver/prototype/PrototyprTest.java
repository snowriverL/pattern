package com.snowriver.prototype;

import com.snowriver.prototype.simple.Client;
import com.snowriver.prototype.simple.Customer;
import com.snowriver.prototype.simple.Prototype;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrototyprTest {

    @Test
    public void Test() {
        Customer customer = new Customer();

        customer.setName("Snowriver");
        customer.setAge(18);
        List hobbies = new ArrayList<String>();
        customer.setHabbits(hobbies);
        System.out.println(customer);

        Client client = new Client(customer);
        Customer customerClone = (Customer)client.startClone(customer);
        System.out.println(customerClone);

        System.out.println("克隆对象中的引用类型地址值： " + customerClone.getHabbits() + " : " + customerClone.getName());
        System.out.println("原对象中的引用类型地址值： " + customer.getHabbits() + " : " + customer.getName());
        System.out.println("对象地址比较： "+(customer.getHabbits() ==
                customerClone.getHabbits()));
    }
}