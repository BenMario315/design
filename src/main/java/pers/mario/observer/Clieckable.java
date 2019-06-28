package pers.mario.observer;

/**
 * @Project: design
 * @PackageName: pers.mario.observer
 * @FileName: Clieckable.java
 * @Description: The Clieckable is...
 * @Author: mario
 * @Time: 2019-06-28 14:06:10
 * @Version:V1.0.0
 */
public interface Clieckable {
    void click();

    void addObserver(Observer observer);

    void delObserver(Observer observer);
}
