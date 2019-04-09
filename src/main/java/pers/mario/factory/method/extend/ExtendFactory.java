package pers.mario.factory.method.extend;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.method.extend
 * @FileName: ExtendFactory.java
 * @Description: The ExtendFactory is...
 * @Author: mario
 * @Time: 2019-04-08 15:54:22
 * @Version:V1.0.0
 */
public interface ExtendFactory {
    <T>T creatBook(Class<T> c);
}
