package pers.mario.proxy.dynamic.extend;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Project: design
 * @PackageName: pers.mario.proxy.dynamic
 * @FileName: ToolAuthorInvocationHandler.java
 * @Description: The ToolAuthorInvocationHandler is...
 * @Author: mario
 * @Time: 2019-04-11 17:20:20
 * @Version:V1.0.0
 */
public class ToolAuthorInvocationHandler implements InvocationHandler {

    private Object obj;

    public ToolAuthorInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(this.obj, args);

    }
}
