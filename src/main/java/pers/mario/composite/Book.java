package pers.mario.composite;

/**
 * @Project: design
 * @PackageName: pers.mario.composite
 * @FileName: Book.java
 * @Description: The Book is...
 * @Author: mario
 * @Time: 2019-04-16 14:03:55
 * @Version:V1.0.0
 */
public class Book implements Bookshelf {

    @Override
    public void operation() {
        System.out.println("你要读这本书么？");
    }
}
