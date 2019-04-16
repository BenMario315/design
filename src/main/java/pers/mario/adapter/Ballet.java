package pers.mario.adapter;

/**
 * @Project: design
 * @PackageName: pers.mario.adapter
 * @FileName: Ballet.java
 * @Description: The Ballet is...
 * @Author: mario
 * @Time: 2019-04-15 17:28:49
 * @Version:V1.0.0
 */
public class Ballet extends NovelAuthor implements Dancer {

    @Override
    public void dance() {
        System.out.println("我会跳芭蕾舞。");
    }
}
