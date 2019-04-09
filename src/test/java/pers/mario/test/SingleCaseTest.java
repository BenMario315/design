package pers.mario.test;

import org.junit.Test;
import pers.mario.singleton.HungrySingleCase;
import pers.mario.singleton.SluggardSingleCase;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: SingleCaseTest.java
 * @Description: The SingleCaseTest is...
 * @Author: mario
 * @Time: 2019-04-08 16:15:54
 * @Version:V1.0.0
 */
public class SingleCaseTest {

    /**
     * 饿汉式单例测试
     * 预期结果：所有对象的哈希值相同
     */
    @Test
    public void hungrySingleCaseTest() {
        HungrySingleCase hungrySingleCase_1 = HungrySingleCase.getSingleCase();
        HungrySingleCase hungrySingleCase_2 = HungrySingleCase.getSingleCase();
        HungrySingleCase hungrySingleCase_3 = HungrySingleCase.getSingleCase();
        HungrySingleCase hungrySingleCase_4 = HungrySingleCase.getSingleCase();

        System.out.println(hungrySingleCase_1.hashCode());
        System.out.println(hungrySingleCase_2.hashCode());
        System.out.println(hungrySingleCase_3.hashCode());
        System.out.println(hungrySingleCase_4.hashCode());

    }

    /**
     * 懒汉式单例测试
     * 预期结果：所有对象的哈希值相同
     */
    @Test
    public void sluggardSingleCaseTest(){
        SluggardSingleCase sluggardSingleCase_1 = SluggardSingleCase.getSingleCase();
        SluggardSingleCase sluggardSingleCase_2 = SluggardSingleCase.getSingleCase();
        SluggardSingleCase sluggardSingleCase_3 = SluggardSingleCase.getSingleCase();
        SluggardSingleCase sluggardSingleCase_4 = SluggardSingleCase.getSingleCase();

        System.out.println(sluggardSingleCase_1.hashCode());
        System.out.println(sluggardSingleCase_2.hashCode());
        System.out.println(sluggardSingleCase_3.hashCode());
        System.out.println(sluggardSingleCase_4.hashCode());
    }
}
