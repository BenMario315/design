package pers.mario.strategy;

import java.math.BigDecimal;

/**
 * @Project: design
 * @PackageName: pers.mario.strategy
 * @FileName: EighthFoldDiscount.java
 * @Description: The EighthFoldDiscount is...
 * @Author: mario
 * @Time: 2019-06-26 15:49:29
 * @Version:V1.0.0
 */
public class EighthFoldDiscount extends AbstractDiscount {

    public EighthFoldDiscount(Integer num, Double price) {
        super(num, price);
    }

    /**
     * 八五折
     *
     * @return
     */
    @Override
    public BigDecimal discount() {
        return getPrice().multiply(BigDecimal.valueOf(getNum() * 0.85));
    }
}
