package pers.mario.observer;

/**
 * @Project: design
 * @PackageName: pers.mario.observer
 * @FileName: ButtonObserver.java
 * @Description: The ButtonObserver is...
 * @Author: mario
 * @Time: 2019-06-28 14:14:43
 * @Version:V1.0.0
 */
public class ButtonObserver implements Observer {
    @Override
    public void clicked(Clieckable clieckable) {
        System.out.println("作为一个观察者，我当然看到按钮被点了。");
    }
}
