package pers.mario.strategy;

import java.math.BigDecimal;

/**
 * @Project: design
 * @PackageName: pers.mario.strategy
 * @FileName: AbstractDiscount.java
 * @Description: The AbstractDiscount is...
 * @Author: mario
 * @Time: 2019-06-26 15:32:46
 * @Version:V1.0.0
 */
public abstract class AbstractDiscount {
    public AbstractDiscount(Integer num, Double price) {
        this.num = num;
        this.price = BigDecimal.valueOf(price);
    }

    private Integer num;
    private BigDecimal price;

    public abstract BigDecimal discount();

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
