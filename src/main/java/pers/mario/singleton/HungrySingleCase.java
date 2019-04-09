package pers.mario.singleton;

/**
 * @Project: design
 * @PackageName: pers.mario.singlecase
 * @FileName: HungrySingleCase.java
 * @Description: 这里测试的单例对象都是当前对象本身，当然也可以是别的对象
 * @Author: mario
 * @Time: 2019-04-08 13:39:15
 * @Version:V1.0.0
 */
public class HungrySingleCase {
    private HungrySingleCase() {
    }

    private static HungrySingleCase singleCase = new HungrySingleCase();

    public static HungrySingleCase getSingleCase() {
        return singleCase;
    }

}
