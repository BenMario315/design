package pers.mario.factory.method.extend;

import pers.mario.factory.method.Book;

import java.lang.reflect.InvocationTargetException;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.method.extend
 * @FileName: ExtendBookFactory.java
 * @Description: The ExtendBookFactory is...
 * @Author: mario
 * @Time: 2019-04-08 15:58:07
 * @Version:V1.0.0
 */
public class ExtendBookFactory implements ExtendFactory {

    @Override
    public <T> T creatBook(Class<T> c) {

        try {

            //CloneBook bookOne = (CloneBook) Class.forName(c.getName()).newInstance(); //Java9 以上标示过时，

            Book bookTwo = (Book) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
            return (T) bookTwo;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
