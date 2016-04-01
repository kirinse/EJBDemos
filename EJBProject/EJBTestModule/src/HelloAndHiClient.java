
import com.ejb.HelloRemote;
import com.ejb.HiRemote;
import org.junit.Before;
import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Hashtable;

/**
 * Created by gao on 16-3-31.
 */
public class HelloAndHiClient {
    final String appName = "";
    final String moduleName01 = "EJBModuleTest01_war";
    final String moduleName02 = "EJBModuleTest02_war";
    final String distinctName = "";
    final String beanName01 = "HelloEJB";
    final String beanName02 = "HiEJB";
    String viewClassName = null;
    String namespace = null;
    Hashtable jndiProperties = null;
    Context context = null;

    @Before
    public void before() throws NamingException {
        jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        context = new InitialContext(jndiProperties);
    }

    @Test
    public void testHelloRemote() throws NamingException {
        viewClassName = HelloRemote.class.getName();
        namespace = "ejb:" + appName + "/" + moduleName01
                + "/" + distinctName + "/" + beanName01 + "!" + viewClassName;
        System.out.println("namespace01:" + namespace);
        HelloRemote hello = (HelloRemote) context.lookup(namespace);
        System.out.println("HelloRemote:" + hello);
        System.out.println(hello.sayHello("EJBModuleTest01_war"));
    }

    @Test
    public void testHiRemote() throws NamingException {
        viewClassName = HiRemote.class.getName();
        namespace = "ejb:" + appName + "/" + moduleName02
                + "/" + distinctName + "/" + beanName02 + "!" + viewClassName;
        System.out.println("namespace02:" + namespace);
        HiRemote hi = (HiRemote) context.lookup(namespace);
        System.out.println("HiRemote:" + hi);
        System.out.println(hi.sayHi("EJBModuleTest02_war"));
    }
}
