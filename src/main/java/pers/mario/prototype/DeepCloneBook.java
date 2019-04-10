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
public class DeepCloneBook implements Cloneable {
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
    public DeepCloneBook clone() {
        try {

            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);
            //将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (DeepCloneBook) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
