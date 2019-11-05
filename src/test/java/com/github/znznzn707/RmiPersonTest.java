package com.github.znznzn707;

import Rmi.Person.NonOwnerInvocationHandler;
import Rmi.Person.OwnerInvocationHandler;
import Rmi.Person.PersonBean;
import Rmi.Person.PersonBeanImp1;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class RmiPersonTest {
    @Test
    public void Test() {
        PersonBean joe = new PersonBeanImp1() ;
        PersonBean ownerproxy = getOwnerProxy(joe) ;
        System.out.println("name is "+ownerproxy.getName());
        ownerproxy.setInterests("bowling,Go");

        try{
            ownerproxy.setHotOrNotRating(10);
        }catch (Exception e) {
            System.out.println("can't set raing from owner proxy");
        }
        System.out.println("Raing is "+ownerproxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe) ;
        System.out.println(nonOwnerProxy.getName());
        try{
            nonOwnerProxy.setInterests("bowling, Go");
        }catch (Exception e){
            System.out.println("cannot set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating is "+nonOwnerProxy.getHotOrNotRating());
    }
    public PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        ) ;
    }
    public PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        ) ;
    }
}
