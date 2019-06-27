package pers.mario.Iterator;

/**
 * @Project: design
 * @PackageName: pers.mario.Iterator
 * @FileName: Box.java
 * @Description: The Box is...
 * @Author: mario
 * @Time: 2019-06-26 18:19:00
 * @Version:V1.0.0
 */
public interface Box {
    void add(Object object);

    Iterator createIterator();
}
