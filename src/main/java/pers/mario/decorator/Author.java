package pers.mario.decorator;

/**
 * @Project: design
 * @PackageName: pers.mario.decorator
 * @FileName: Author.java
 * @Description: The Author is...
 * @Author: mario
 * @Time: 2019-04-15 10:46:12
 * @Version:V1.0.0
 */
public interface Author {
    /**
     * 作家具有写作的能力
     */
    void write();

    /**
     * 作家都给自己写的书上签名
     */
    void sign();
}
