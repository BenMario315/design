package pers.mario.test;

import org.junit.Test;
import pers.mario.bridge.*;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: BridgeTest.java
 * @Description: The BridgeTest is...
 * @Author: mario
 * @Time: 2019-04-16 18:43:13
 * @Version:V1.0.0
 */
public class BridgeTest {

    @Test
    public void bridgeTest(){
        Material material = new A4();
        AbstractBook novelBook =new NovelBook(material);
        novelBook.materialInfo();

        AbstractBook toolBook =new ToolBook(material);
        toolBook.materialInfo();

        material = new A8();
        toolBook  = new ToolBook(material);
        toolBook.materialInfo();

    }
}
