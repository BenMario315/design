package pers.mario.test;

import org.junit.Test;
import pers.mario.factory.method.*;
import pers.mario.factory.method.extend.ExtendBookFactory;
import pers.mario.factory.method.extend.ExtendFactory;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: FactoryMethodTest.java
 * @Description: The FactoryMethodTest is...
 * @Author: mario
 * @Time: 2019-04-09 09:58:04
 * @Version:V1.0.0
 */
public class FactoryMethodTest {

    @Test
    public void factoryMethodTest(){
        BookFactory bookFactory = new NovelBookFactory();
        NovelBook novelBook = (NovelBook) bookFactory.create();
        System.out.println(novelBook.getClass());

        bookFactory = new ToolBookFactory();
        ToolBook toolBook = (ToolBook) bookFactory.create();
        System.out.println(toolBook.getClass());

    }

    @Test
    public void extendFactoryTest(){
        ExtendFactory bookFactory = new ExtendBookFactory();
        NovelBook novelBook = bookFactory.creatBook(NovelBook.class);
        System.out.println(novelBook.getClass());
        ToolBook toolBook = bookFactory.creatBook(ToolBook.class);
        System.out.println(toolBook.getClass());
    }

}
