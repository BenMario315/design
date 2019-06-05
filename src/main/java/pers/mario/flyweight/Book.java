package pers.mario.flyweight;

/**
 * @Project: design
 * @PackageName: pers.mario.flyweight
 * @FileName: Book.java
 * @Description: The Book is...
 * @Author: mario
 * @Time: 2019-06-05 10:59:14
 * @Version:V1.0.0
 */
public class Book implements IBook {
    public Book(String type){
        this.type = type;
    }

    private String type;

    @Override
    public void reader() {
        System.out.println("我正在读"+type+"书");

    }
}
