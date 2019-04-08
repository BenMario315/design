package pers.mario.factory.extend;

import pers.mario.factory.method.BookFactory;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.extend
 * @FileName: Factory.java
 * @Description: The Factory is...
 * @Author: mario
 * @Time: 2019-04-08 15:54:22
 * @Version:V1.0.0
 */
public interface Factory {
    <T extends Book>T creatBook(Class<T> c);
}
