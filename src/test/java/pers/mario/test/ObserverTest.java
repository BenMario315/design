package pers.mario.test;

import org.junit.Test;
import pers.mario.observer.Button;
import pers.mario.observer.ButtonObserver;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: ObserverTest.java
 * @Description: The ObserverTest is...
 * @Author: mario
 * @Time: 2019-06-28 14:15:59
 * @Version:V1.0.0
 */
public class ObserverTest {

    @Test
    public void observerTest(){
        Button button = new Button();
        button.addObserver(new ButtonObserver());
        button.click();
    }
}
