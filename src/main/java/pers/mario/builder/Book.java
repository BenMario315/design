package pers.mario.builder;

/**
 * @Project: design
 * @PackageName: pers.mario.builder
 * @FileName: CloneBook.java
 * @Description: The CloneBook is...
 * @Author: mario
 * @Time: 2019-04-10 09:54:36
 * @Version:V1.0.0
 */
public abstract class Book {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
