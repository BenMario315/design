package pers.mario.abstracted.factory;

/**
 * @Project: design
 * @PackageName: pers.mario.abstracted.factory
 * @FileName: NovelBook.java
 * @Description: The NovelBook is...
 * @Author: mario
 * @Time: 2019-04-09 17:02:17
 * @Version:V1.0.0
 */
public class NovelBook implements Book {

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
