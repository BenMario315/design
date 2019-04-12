package pers.mario.proxy.dynamic.extend;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Project: design
 * @PackageName: pers.mario.proxy.dynamic.extend
 * @FileName: ToolAuthorProxy.java
 * @Description: The ToolAuthorProxy is...
 * @Author: mario
 * @Time: 2019-04-12 09:45:16
 * @Version:V1.0.0
 */
public class ToolAuthorProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        (new BeforeOperate()).execute();
        T t = (T) Proxy.newProxyInstance(loader, interfaces, h);
        return t;
    }
}
