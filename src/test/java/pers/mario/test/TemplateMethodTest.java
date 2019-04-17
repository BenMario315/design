package pers.mario.test;

import org.junit.Test;
import pers.mario.template.method.NovelAuthor;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: TemplateMethodTest.java
 * @Description: The TemplateMethodTest is...
 * @Author: mario
 * @Time: 2019-04-17 16:12:38
 * @Version:V1.0.0
 */
public class TemplateMethodTest {

    @Test
    public void templateMethodTest(){
        NovelAuthor novelAuthor = new NovelAuthor();
        novelAuthor.oneDay();

    }
}
