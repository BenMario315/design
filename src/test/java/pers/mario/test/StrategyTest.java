package pers.mario.test;

import org.junit.Test;
import pers.mario.strategy.Calculate;
import pers.mario.strategy.EighthFoldDiscount;
import pers.mario.strategy.FixDiscount;
import pers.mario.strategy.NoDiscount;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: StrategyTest.java
 * @Description: The StrategyTest is...
 * @Author: mario
 * @Time: 2019-06-26 15:52:49
 * @Version:V1.0.0
 */
public class StrategyTest {

    @Test
    public void strategyTest() {
        Calculate calculateNo = new Calculate(new NoDiscount(20, 21.5));
        System.out.println("免费书籍计算价格：" + calculateNo.calculatePrice());
        Calculate calculateFix = new Calculate(new FixDiscount(20, 21.5));
        System.out.println("原价书籍计算价格：" + calculateFix.calculatePrice());
        Calculate calculateEighthFold = new Calculate(new EighthFoldDiscount(20, 21.5));
        System.out.println("八五折书籍计算价格：" + calculateEighthFold.calculatePrice());

    }
}
