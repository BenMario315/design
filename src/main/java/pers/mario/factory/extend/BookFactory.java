package pers.mario.factory.extend;

import java.lang.reflect.InvocationTargetException;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.extend
 * @FileName: BookFactory.java
 * @Description: The BookFactory is...
 * @Author: mario
 * @Time: 2019-04-08 15:58:07
 * @Version:V1.0.0
 */
public class BookFactory implements Factory {
    public <T extends Book> T creatBook(Class<T> c) {

        try {
            //Java9对一下方法标示过时
            Book book_1 = (Book) Class.forName(c.getName()).newInstance();
            //用于替换过时方法
            Book book_2 = (Book) Class.forName(c.getName()).getDeclaredConstructor().newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }





            return null;
    }
}
