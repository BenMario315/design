package pers.mario.test;

import org.junit.Test;
import pers.mario.decorator.Author;
import pers.mario.decorator.AuthorDecorator;
import pers.mario.decorator.Decorator;
import pers.mario.decorator.NovelAuthor;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: DecoratorTest.java
 * @Description: The DecoratorTest is...
 * @Author: mario
 * @Time: 2019-04-15 11:39:24
 * @Version:V1.0.0
 */
public class DecoratorTest {

    @Test
    public void decoratorTest(){

        Author author = new NovelAuthor();
        Decorator decorator = new AuthorDecorator(author);
        decorator.write();
        decorator.sign();
    }


}
