package pers.mario.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: design
 * @PackageName: pers.mario.composite
 * @FileName: Bookroom.java
 * @Description: The Bookroom is...
 * @Author: mario
 * @Time: 2019-04-16 14:03:42
 * @Version:V1.0.0
 */
public class Bookroom implements Bookshelf {

    List<Bookshelf> list = new ArrayList<>();

    public void addBookshelf(Bookshelf bookshelf){
        list.add(bookshelf);
    }

    public void remove(Bookshelf bookshelf){
        list.remove(bookshelf);
    }

    public List<Bookshelf> getChild(){
        return list;
    }

    @Override
    public void operation() {
        System.out.println("书架是用来放书的");
    }
}
