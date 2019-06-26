package pers.mario.strategy;

import java.math.BigDecimal;

/**
 * @Project: design
 * @PackageName: pers.mario.strategy
 * @FileName: FixDiscount.java
 * @Description: The FixDiscount is...
 * @Author: mario
 * @Time: 2019-06-26 15:42:04
 * @Version:V1.0.0
 */
public class FixDiscount extends AbstractDiscount {
    public FixDiscount(Integer num, Double price) {
        super(num, price);
    }

    /**
     * 原价商品
     *
     * @return
     */
    @Override
    public BigDecimal discount() {
        return getPrice().multiply((BigDecimal.valueOf(getNum() * 1)));
    }
}
