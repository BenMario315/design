package pers.mario.test;

import org.junit.Test;
import pers.mario.responsibility.chain.FirstGrade;
import pers.mario.responsibility.chain.Grade;
import pers.mario.responsibility.chain.SecondGrade;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: ResponsibilityChainTest.java
 * @Description: The ResponsibilityChainTest is...
 * @Author: mario
 * @Time: 2019-06-06 14:49:44
 * @Version:V1.0.0
 */
public class ResponsibilityChainTest {


    @Test
    public void responsibilityChainTest(){
        Grade firstGrade = new FirstGrade();
        Grade secondGrade = new SecondGrade();
        firstGrade.setGrade(secondGrade);
        firstGrade.setGradeName("一年级");
        firstGrade.setScore(70);
        secondGrade.setScore(50);
        secondGrade.setGradeName("二年级");
        secondGrade.setGrade(null);

        firstGrade.upgrade();

    }

}
