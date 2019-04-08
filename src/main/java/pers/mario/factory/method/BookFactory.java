package pers.mario.factory.method;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.method
 * @FileName: BookFactory.java
 * @Description: 总工厂定义接口
 * @Author: mario
 * @Time: 2019-04-08 15:01:34
 * @Version:V1.0.0
 */
public interface BookFactory {

    /**
     * 定义创建Book对象的方法，所有工厂实现该接口创建对应的book。
     * @return book
     */
    Book create();

}
