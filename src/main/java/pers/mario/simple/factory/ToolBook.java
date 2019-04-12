package pers.mario.simple.factory;

import java.math.BigDecimal;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.simple
 * @FileName: ToolAbstractBook.java
 * @Description: The ToolAbstractBook is...
 * @Author: mario
 * @Time: 2019-04-08 13:53:58
 * @Version:V1.0.0
 */
public class ToolBook implements Book{
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
