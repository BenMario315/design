package pers.mario.test;

import org.junit.Test;
import pers.mario.Iterator.BookBox;
import pers.mario.Iterator.Iterator;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: IteratorTest.java
 * @Description: The IteratorTest is...
 * @Author: mario
 * @Time: 2019-06-26 18:35:58
 * @Version:V1.0.0
 */
public class IteratorTest {

    @Test
    public void iteratorTest() {
        BookBox bookBox = new BookBox();
        bookBox.add("历史书");
        bookBox.add("政治书");
        bookBox.add("语文书");
        bookBox.add("数学书");
        bookBox.add("英语书");

        Iterator iterator = bookBox.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
