package pers.mario.test;

import org.junit.Test;
import pers.mario.adapter.Ballet;
import pers.mario.adapter.Dancer;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: AdapterTest.java
 * @Description: The AdapterTest is...
 * @Author: mario
 * @Time: 2019-04-15 17:34:48
 * @Version:V1.0.0
 */
public class AdapterTest {

    @Test
    public void adapterTest(){
        Dancer dancer = new Ballet();

        ((Ballet) dancer).write();
        dancer.dance();

    }
}
