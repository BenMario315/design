package pers.mario.prototype;

import java.io.*;

/**
 * @Project: design
 * @PackageName: pers.mario.prototype
 * @FileName: CloneBook.java
 * @Description: The CloneBook is...
 * @Author: mario
 * @Time: 2019-04-10 17:06:14
 * @Version:V1.0.0
 */
public class CloneBook implements Cloneable,Serializable {
    private String name;
    private Author author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public CloneBook clone() {
        try {
            return (CloneBook) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("没有实现Cloneable接口，就会跑改异常");
            e.printStackTrace();
        }
        return null;
    }

}
