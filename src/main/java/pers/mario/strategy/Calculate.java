package pers.mario.strategy;

import java.math.BigDecimal;

/**
 * @Project: design
 * @PackageName: pers.mario.strategy
 * @FileName: Calculate.java
 * @Description: The Calculate is...
 * @Author: mario
 * @Time: 2019-06-26 15:56:48
 * @Version:V1.0.0
 */
public class Calculate {
    private AbstractDiscount discount;

    public Calculate(AbstractDiscount discount) {
        this.discount = discount;
    }

    public BigDecimal calculatePrice() {
        return discount.discount();
    }
}
