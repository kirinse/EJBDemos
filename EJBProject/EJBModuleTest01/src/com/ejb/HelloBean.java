package com.ejb;

import javax.ejb.Stateless;

/**
 * Created by gao on 16-3-31.
 */
@Stateless(name = "HelloEJB")
public class HelloBean implements HelloRemote {
    public HelloBean() {
        System.out.println("EJBModuleTest01-HelloBean");
    }

    @Override
    public String sayHello(String world) {
        return "EJBModuleTest01-sayHello():" + world;
    }
}
