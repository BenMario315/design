package pers.mario.test;

import org.junit.Test;
import pers.mario.memento.Document;
import pers.mario.memento.VersionControl;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: MementoTest.java
 * @Description: The MementoTest is...
 * @Author: mario
 * @Time: 2019-06-28 15:30:05
 * @Version:V1.0.0
 */
public class MementoTest {

    @Test
    public void mementoTest(){
        Document document = new Document("测试文档","没有备份前的内容");
        VersionControl versionControl = new VersionControl();
        versionControl.addBackup(document.backup());

        System.out.println(document);

        document.setContent("第一次修改，并且要保存。");
        versionControl.addBackup(document.backup());

        System.out.println(document);

        document.recover(versionControl.get(0));

        System.out.println(document);
    }
}
