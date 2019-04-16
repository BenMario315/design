package pers.mario.test;

import org.junit.Test;
import pers.mario.composite.Book;
import pers.mario.composite.Bookroom;
import pers.mario.composite.Bookshelf;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: CompositeTest.java
 * @Description: The CompositeTest is...
 * @Author: mario
 * @Time: 2019-04-16 14:25:38
 * @Version:V1.0.0
 */
public class CompositeTest {

    @Test
    public void compositeTest(){
        Bookroom bookroom = new Bookroom();

        Bookshelf novelBookshelf = new Bookroom();

        bookroom.addBookshelf(novelBookshelf);
        bookroom.addBookshelf(new Bookroom());

        ((Bookroom) novelBookshelf).addBookshelf(new Book());
        ((Bookroom) novelBookshelf).addBookshelf(new Book());

    }
}
