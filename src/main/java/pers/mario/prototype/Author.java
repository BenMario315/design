package pers.mario.prototype;

import java.io.Serializable;

/**
 * @Project: design
 * @PackageName: pers.mario.prototype
 * @FileName: Author.java
 * @Description: The Author is...
 * @Author: mario
 * @Time: 2019-04-10 17:07:01
 * @Version:V1.0.0
 */
public class Author implements Serializable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
