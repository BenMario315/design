package pers.mario.test;

import org.junit.Test;
import pers.mario.proxy.dynamic.Author;
import pers.mario.proxy.dynamic.AuthorInvocationHandler;
import pers.mario.proxy.dynamic.extend.ToolAuthorInvocationHandler;
import pers.mario.proxy.dynamic.extend.ToolAuthorProxy;
import pers.mario.proxy.statical.ProxyNovelAuthor;

import java.lang.reflect.Proxy;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: ProxyTest.java
 * @Description: The ProxyTest is...
 * @Author: mario
 * @Time: 2019-04-11 16:22:15
 * @Version:V1.0.0
 */
public class ProxyTest {

    @Test
    public void proxyTest() {

        ProxyNovelAuthor proxyNovelAuthor = new ProxyNovelAuthor();
        proxyNovelAuthor.write();

    }

    @Test
    public void dynamicProxyTest_1() {

        AuthorInvocationHandler authorInvocationHandler = new AuthorInvocationHandler((Author) () -> System.out.println("我是现在要准备写小说了"));

        ClassLoader classLoader = authorInvocationHandler.getClass().getClassLoader();
        Class[] cls = new Class[]{Author.class};

        Author author = (Author) Proxy.newProxyInstance(classLoader, cls, authorInvocationHandler);
        author.write();
    }

    @Test
    public void dynamicProxyTest_2() {

        AuthorInvocationHandler authorInvocationHandler = new AuthorInvocationHandler((Author) () -> System.out.println("我是现在要准备写一本工具书..."));

        ClassLoader classLoader = authorInvocationHandler.getClass().getClassLoader();
        Class[] cls = new Class[]{Author.class};

        Author author = (Author) Proxy.newProxyInstance(classLoader, cls, authorInvocationHandler);
        author.write();
    }

    @Test
    public void dynamicProxyTest_3() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class[] cls = new Class[]{Author.class};

        Author author = (Author) ToolAuthorProxy.newProxyInstance(classLoader, cls, new ToolAuthorInvocationHandler((Author) () -> System.out.println("我在写一本工具书")));

        author.write();

    }


}
