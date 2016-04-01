package com.ejb;

import javax.ejb.Remote;

/**
 * Created by gao on 16-3-31.
 */
@Remote
public interface HelloRemote {
    public String sayHello(String world);
}
