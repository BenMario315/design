package pers.mario.proxy.dynamic;

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
public class AuthorInvocationHandler implements InvocationHandler {

    private Object obj;

    public AuthorInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我写作之前，都要喝咖啡。");
        Object result = method.invoke(this.obj, args);
        System.out.println("我写完了，签名并送给你。");
        return result;
    }
}
