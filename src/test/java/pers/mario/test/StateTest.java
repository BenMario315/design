package pers.mario.test;

import org.junit.Test;
import pers.mario.state.School;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: StateTest.java
 * @Description: The StateTest is...
 * @Author: mario
 * @Time: 2019-07-01 10:36:32
 * @Version:V1.0.0
 */
public class StateTest {

    @Test
    public void statetest(){
        School school = new School();
        school.setNow(school.getMath());
        school.study();

        school.setNow(school.getBiology());
        school.study();
    }
}
