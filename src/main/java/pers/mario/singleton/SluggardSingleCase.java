package pers.mario.singleton;

/**
 * @Project: design
 * @PackageName: pers.mario.singlecase
 * @FileName: SluggardSingleCase.java
 * @Description: 这里测试的单例对象都是当前对象本身，当然也可以是别的对象
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
