package pers.mario.singlecase;

/**
 * @Project: design
 * @PackageName: pers.mario.singlecase
 * @FileName: SluggardSingleCase.java
 * @Description: The SluggardSingleCase is...
 * @Author: mario
 * @Time: 2019-04-08 13:40:22
 * @Version:V1.0.0
 */
public class SluggardSingleCase {
    private SluggardSingleCase() {
    }

    private static SluggardSingleCase sluggardSingleCase = null;

    synchronized public static SluggardSingleCase getSingleCase() {
        //判断该对象是否为null，本质是判断否第一次引用
        if (sluggardSingleCase == null) {
            sluggardSingleCase = new SluggardSingleCase();
        }
        return sluggardSingleCase;
    }
}
