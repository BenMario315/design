package pers.mario.test;

import org.junit.Test;
import pers.mario.facade.Book;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: FacadeTese.java
 * @Description: The FacadeTese is...
 * @Author: mario
 * @Time: 2019-04-17 14:06:33
 * @Version:V1.0.0
 */
public class FacadeTese {

    @Test
    public void facadeTese(){
        Book book = new Book();

        book.read();
        book.use();
    }
}
