package pers.mario.proxy.dynamic.extend;

/**
 * @Project: design
 * @PackageName: pers.mario.proxy.dynamic.extend
 * @FileName: BeforeOperate.java
 * @Description: The BeforeAdvice is...
 * @Author: mario
 * @Time: 2019-04-12 09:50:17
 * @Version:V1.0.0
 */
public class BeforeOperate implements Operate {
    @Override
    public void execute() {
        System.out.println("操作前要做的事情");
    }
}
