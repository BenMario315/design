package pers.mario.singlecase;

/**
 * @Project: design
 * @PackageName: pers.mario.singlecase
 * @FileName: HungrySingleCase.java
 * @Description: The HungrySingleCase is...
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
