package pers.mario.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: design
 * @PackageName: pers.mario.observer
 * @FileName: Button.java
 * @Description: The Button is...
 * @Author: mario
 * @Time: 2019-06-28 14:10:43
 * @Version:V1.0.0
 */
public class Button implements Clieckable {
    List<Observer> list = new ArrayList<>();

    @Override
    public void click() {
        System.out.println("按钮被点击了");
        list.forEach(item->{
            item.clicked(this);
        });
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        list.remove(observer);
    }
}
