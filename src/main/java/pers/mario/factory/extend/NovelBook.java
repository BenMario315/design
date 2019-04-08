package pers.mario.factory.extend;

import java.math.BigDecimal;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.extend
 * @FileName: NovelBook.java
 * @Description: The NovelBook is...
 * @Author: mario
 * @Time: 2019-04-08 16:12:41
 * @Version:V1.0.0
 */
public class NovelBook implements Book {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}