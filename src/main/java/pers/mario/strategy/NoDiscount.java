package pers.mario.strategy;

import java.math.BigDecimal;

/**
 * @Project: design
 * @PackageName: pers.mario.strategy
 * @FileName: NoDiscount.java
 * @Description: The NoDiscount is...
 * @Author: mario
 * @Time: 2019-06-26 15:36:34
 * @Version:V1.0.0
 */
public class NoDiscount extends AbstractDiscount {

    public NoDiscount(Integer num, Double price) {
        super(num, price);
    }

    /**
     * 免费赠品
     *
     * @return
     */
    @Override
    public BigDecimal discount() {
        return BigDecimal.valueOf(0);
    }
}
