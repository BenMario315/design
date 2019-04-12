package pers.mario.test;

import org.junit.Test;
import pers.mario.abstracted.factory.*;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: AbstractFactoryTest.java
 * @Description: The AbstractFactoryTest is...
 * @Author: mario
 * @Time: 2019-04-09 15:41:51
 * @Version:V1.0.0
 */
public class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest() {
        OperateFactory factory = new MysqlOperateFactory();
        factory.addBook(new NovelBook());
        factory.delete(1);
        factory.getBook(1);
        factory.modify(new ToolBook());

        factory = new OracleOpareteFactory();
        factory.addBook(new NovelBook());
        factory.delete(1);
        factory.getBook(1);
        factory.modify(new ToolBook());
    }
}
