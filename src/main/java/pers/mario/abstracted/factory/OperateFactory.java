package pers.mario.abstracted.factory;

/**
 * @Project: design
 * @PackageName: pers.mario.abstracted.factory
 * @FileName: OperateFactory.java
 * @Description: The OperateFactory is...
 * @Author: mario
 * @Time: 2019-04-09 14:36:54
 * @Version:V1.0.0
 */
public interface OperateFactory {
    /**
     * 想数据库中添加一本书
     * @param book 要添加的对象
     */
    void addBook(Book book);

    /**
     * 根据id从数据库中删除某个对象
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据id从数据库中查询某本书籍
     * @param id 带查询的对象id
     * @return book
     */
    Book getBook(Integer id);

    /**
     * 修改数据库中对象
     * @param book
     * @return
     */
    Boolean modify(Book book);
}
