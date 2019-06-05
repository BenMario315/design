package pers.mario.test;

import org.junit.Test;
import pers.mario.flyweight.Book;
import pers.mario.flyweight.BookFactory;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: FlyWeightTest.java
 * @Description: The FlyWeightTest is...
 * @Author: mario
 * @Time: 2019-06-05 11:04:02
 * @Version:V1.0.0
 */
public class FlyWeightTest {
    @Test
    public void flyWeightTest(){
        Book book = BookFactory.getBook("历史");
        book.reader();
        System.out.println(book.hashCode());
        Book book2 = BookFactory.getBook("历史");
        System.out.println(book2.hashCode());

    }
}
