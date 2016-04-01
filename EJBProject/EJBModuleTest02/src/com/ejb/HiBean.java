package com.ejb;

import javax.ejb.Stateless;

/**
 * Created by gao on 16-3-31.
 */
@Stateless(name = "HiEJB")
public class HiBean implements HiRemote {
    public HiBean() {
        System.out.println("EJBModuleTest02-HiBean");
    }

    @Override
    public String sayHi(String world) {
        return "EJBModuleTest02-sayHi()" + world;
    }
}
