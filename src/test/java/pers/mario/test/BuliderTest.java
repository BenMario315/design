package pers.mario.test;

import org.junit.Test;
import pers.mario.builder.NovelAbstractBook;
import pers.mario.builder.NovelBookBuilder;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: BuliderTest.java
 * @Description: The BuliderTest is...
 * @Author: mario
 * @Time: 2019-04-10 10:10:33
 * @Version:V1.0.0
 */
public class BuliderTest {


    @Test
    public void test(){
        NovelBookBuilder bookBuilder=new NovelBookBuilder();
        NovelAbstractBook book = (NovelAbstractBook) bookBuilder.createBook();
        System.out.println(book.getId());
        bookBuilder.setBookId(123);
        System.out.println(book.getId());

    }
}
