package com.ejb;

import javax.ejb.Remote;

/**
 * Created by gao on 16-3-31.
 */
@Remote
public interface HiRemote {
    public String sayHi(String world);
}
