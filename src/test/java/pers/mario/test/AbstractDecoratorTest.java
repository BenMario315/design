package pers.mario.test;

import org.junit.Test;
import pers.mario.decorator.*;
import pers.mario.decorator.AuthorDecorator;
import pers.mario.decorator.AbstractDecorator;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: AbstractDecoratorTest.java
 * @Description: The AbstractDecoratorTest is...
 * @Author: mario
 * @Time: 2019-04-15 11:39:24
 * @Version:V1.0.0
 */
public class AbstractDecoratorTest {

    @Test
    public void decoratorTest(){

        Author author = new NovelAuthor();
        AbstractDecorator abstractDecorator = new AuthorDecorator(author);
        abstractDecorator.write();
        abstractDecorator.sign();
    }


}
